package com.kama.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kama.domain.model.WeatherDataEntity
import com.kama.domain.usecase.WeatherDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val useCase: WeatherDataUseCase
) : ViewModel() {

    private val TAG = "MainViewModel::"
    private val _weatherData: MutableList<WeatherDataEntity> = mutableListOf()
    val weatherData = _weatherData
    private val _result: MutableLiveData<Boolean> = MutableLiveData(false)
    var result: LiveData<Boolean> = _result

    // 기온 저장 변수
    var currentTemp: MutableMap<String, String> = mutableMapOf()
    var minTemp: String = ""
    var maxTemp: String = ""

    fun requestWeatherData(
        pageNo: Int,
        numOfRows: Int,
        dataType: String,
        baseDate: String,
        baseTime: String,
        nx: String,
        ny: String
    ) = useCase(
        pageNo,
        numOfRows,
        dataType,
        baseDate,
        baseTime,
        nx,
        ny
    )
        .onEach {
            // 기존 로직에서 그룹화된 데이터를 _weatherDataMap에 저장하도록 수정
            for (i in it.response.body.items.item.indices) {
                val weatherData = WeatherDataEntity(
                    it.response.body.items.item[i].baseDate,
                    it.response.body.items.item[i].baseTime,
                    weatherShape(it.response.body.items.item[i].category) ?: "",
                    it.response.body.items.item[i].fcstDate,
                    it.response.body.items.item[i].fcstTime,
                    it.response.body.items.item[i].fcstValue,
                    it.response.body.items.item[i].nx,
                    it.response.body.items.item[i].ny
                )

                _weatherData.add(weatherData)
                //Timber.d("$TAG::requestWeatherData() ${_weatherData[i]}")
            }
            _result.value = true
        }
        .catch { e -> e.printStackTrace() }
        .launchIn(viewModelScope)

    // 날씨 형태에 따른 분석(category)
    private fun weatherShape(shape: String): String? {
        val data = when (shape) {
            "POP" -> "강수확률"
            "R06" -> "6시간 강수량"
            "REH" -> "습도"
            "S06" -> "6시간 신적설 범주(1mm)"
            "SKY" -> "하늘상태"
            "T3H" -> "3시간 기온"
            "TMN" -> "아침 최저기온"
            "TMX" -> "낮 최고기온"
            "UUU" -> "풍속 (동서성분)"
            "VVV" -> "풍속(남북성분)"
            "PTY" -> "강수형태"
            "WAV" -> "파고"
            "VEC" -> "풍향"
            "WSD" -> "풍속"
            "TMP" -> "1시간 기온"
            "SNO" -> "1시간 신적설"
            "PCP" -> "1시간 강수량"
            else -> ""
        }
        //Timber.d("$TAG::weatherShape() $shape, weatherFcstValue: $weatherFcstValue")
        return data
    }
}