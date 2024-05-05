package com.kama.presentation.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.kama.core.base.BaseFragment
import com.kama.core.util.WeatherUtil
import com.kama.design.R
import com.kama.domain.model.WeatherDataEntity
import com.kama.presentation.databinding.FragmentWeatherBinding
import com.kama.presentation.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class WeatherFragment : BaseFragment<FragmentWeatherBinding>() {

    private val TAG = "WeatherFragment::"
    private lateinit var mainViewModel: MainViewModel

    override fun getFragmentBinding(): FragmentWeatherBinding =
        FragmentWeatherBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViewModel()
        initAppBar()
        init()
    }

    private fun initViewModel() {
        Timber.i("$TAG::initViewModel()")
        mainViewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    private fun initAppBar() {
        Timber.i("$TAG::initAppBar()")
        binding.layoutAppbar.tvTitle.text = getString(R.string.weather_title)
    }

    private fun init() {
        Timber.i("$TAG::init()")
        weatherDataReceive()
        swipeRefresh()
    }

    private fun weatherDataReceive() {
        Timber.i("$TAG::weatherDataReceive()")
        mainViewModel.result.observe(viewLifecycleOwner) { resultData ->
            Timber.d("$TAG::result.observe() $resultData")
            if (resultData) {
                weatherDataParsing(mainViewModel.weatherData)
            } else {
                Toast.makeText(requireContext(), getString(R.string.waiting_data), Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun weatherDataParsing(weatherData: MutableList<WeatherDataEntity>) {
        Timber.i("$TAG::weatherDataParsing()")
        // 강수량 - 강수확률
        val rainAmount: MutableMap<String, String> = mutableMapOf()
        // 바람세기 - 풍속
        val windStrength: MutableMap<String, String> = mutableMapOf()
        // 날씨 형태 - 하늘상태
        val weatherShape: MutableMap<String, String> = mutableMapOf()
        // 습도
        val humidity: MutableMap<String, String> = mutableMapOf()
        // 풍향
        val windDirection: MutableMap<String, String> = mutableMapOf()

        weatherData.forEach {
            val key = "${it.fcstDate};${it.fcstTime}"
            val value: String = it.fcstValue

            when(it.category) {
                "아침 최저기온" -> mainViewModel.minTemp = value
                "낮 최고기온" -> mainViewModel.maxTemp = value
                "1시간 기온" -> mainViewModel.currentTemp[key] = value
                "강수확률" -> rainAmount[key] = value
                "풍속" -> windStrength[key] = value
                "하늘상태" -> weatherShape[key] = value
                "습도" -> humidity[key] = value
                "풍향" -> windDirection[key] = value
            }
        }

        // 강수량 - 강수확률
        rainAmount(rainAmount)
        // 바람세기 - 풍속
        windStrength(windStrength)
        // 날씨 형태 - 하늘상태
        weatherShape(weatherShape)
        // 내일 날씨 예보 - 1시간 기온
        tomorrowWeatherForecast()
        // 습도
        humidity(humidity)
        // 풍향
        windDirection(windDirection)
    }

    private fun currentParsingDate(): String {
        val currentTime: String = WeatherUtil.getCurrentDateTime()
        val currentTimeList = currentTime.split(";")
        return "${currentTimeList[0]};${currentTimeList[1].substring(0, 2)}00"
    }

    // 강수량 - 강수확률
    private fun rainAmount(data: MutableMap<String, String>) {
       val currentParsingDate = currentParsingDate() // parsing 중 현재 날짜와 시간이 달라질 수 있음.

        // 강수확률
        data.forEach { (key, value) ->
            Timber.i("$TAG::rainAmount() $key, $value")
            if (key == currentParsingDate) {
                binding.tvRainValue.text = value
            }
        }
    }

    // 바람세기 - 풍속
    private fun windStrength(data: MutableMap<String, String>) {
        val currentParsingDate = currentParsingDate()

        // 풍속
        data.forEach { (key, value) ->
            Timber.i("$TAG::windStrength() $key, $value")
            if (key == currentParsingDate) {
                binding.tvWindValue.text = value
            }
        }
    }

    // 날씨 형태 - 하늘상태
    private fun weatherShape(data: MutableMap<String, String>) {
        val currentParsingDate = currentParsingDate()

        // 하늘상태
        data.forEach { (key, value) ->
            Timber.i("$TAG::weatherShape() $key, $value")
            if (key == currentParsingDate) {
                //binding.tvWeatherShape.text = value
                // 이미지 변경함.
            }
        }
    }

    // 하늘 상태
    private fun skyState(skyData: String): String? {
        when (skyData) {
            "1" -> return "맑음"
            "3" -> return "구름맑음"
            "4" -> return "흐림"
        }
        //Timber.d("$TAG::skyState() $skyData")
        return skyData
    }

    // 내일 날씨 예보 - 1시간 기온 - viewmodel에 저장된 변수 사용
    private fun tomorrowWeatherForecast() {
        val currentParsingDate = currentParsingDate()
        // 1시간 기온
        mainViewModel.currentTemp.forEach { (key, value) ->
            Timber.i("$TAG::tomorrowWeatherForecast() $key, $value")
            if (key == currentParsingDate) {
                // 현재 온도
                binding.tvCurrentTempValue.text = "$value°C"
            }
        }
    }

    // 습도
    private fun humidity(data: MutableMap<String, String>) {
        val currentParsingDate = currentParsingDate()

        // 습도
        data.forEach { (key, value) ->
            Timber.i("$TAG::humidity() $key, $value")
            if (key == currentParsingDate) {
                binding.tvHumidityValue.text = value
            }
        }
    }

    // 풍향
    private fun windDirection(data: MutableMap<String, String>) {
        val currentParsingDate = currentParsingDate()

        // 풍향
        data.forEach { (key, value) ->
            Timber.i("$TAG::windDirection() $key, $value")
            if (key == currentParsingDate) {
                binding.tvWindDirectionValue.text = parseWindDirection(value.toInt())
            }
        }
    }

    private fun parseWindDirection(degrees: Int): String {
        val directions = arrayOf("북", "북동", "동", "남동", "남", "남서", "서", "북서")
        val index = ((degrees % 360) / 45).toInt()
        return directions[index]
    }

    private fun swipeRefresh() {
        binding.swipeRefreshLayout.setOnRefreshListener {
            mainViewModel.requestWeatherData(
                WeatherUtil.PAGE_NO,
                WeatherUtil.NUM_OF_ROWS,
                WeatherUtil.DATA_TYPE,
                WeatherUtil.BASE_DATE,
                WeatherUtil.BASE_TIME,
                WeatherUtil.NX,
                WeatherUtil.NY
            )
            Toast.makeText(requireContext(), "스와이프 완료", Toast.LENGTH_SHORT).show()
            binding.swipeRefreshLayout.isRefreshing = false // 새로고침 완료
        }
    }
}