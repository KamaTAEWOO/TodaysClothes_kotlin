package com.kama.presentation.clothes

import com.kama.design.R

internal class ClothesStyleMan {

    companion object {
        @Volatile
        private var instance: ClothesStyleMan? = null

        fun getInstance(): ClothesStyleMan {
            return instance ?: synchronized(this) {
                instance ?: ClothesStyleMan().also { instance = it }
            }
        }
    }

    // String 값이 들어오면 해당 변수의 값을 intArrayOf로 반환
    fun getDandyStyle(style: String): IntArray {
        return when (style) {
            "AAD4" -> AAD4
            "AAD5" -> AAD5
            "AAD9" -> AAD9
            "AAD12" -> AAD12
            "AAD17" -> AAD17
            "AAD20" -> AAD20
            "AAD23" -> AAD23
            "AAD28" -> AAD28
            "ABD4" -> ABD4
            "ABD5" -> ABD5
            "ABD9" -> ABD9
            "ABD12" -> ABD12
            "ABD17" -> ABD17
            "ABD20" -> ABD20
            "ABD23" -> ABD23
            "ABD28" -> ABD28
            else -> intArrayOf()
        }
    }

    // String 값이 들어오면 해당 text의 값을 StringArray로 반환
    fun getDandyStyleText(style: String): Array<String> {
        return when (style) {
            "AAD4" -> txt_AAD4
            "AAD5" -> txt_AAD5
            "AAD9" -> txt_AAD9
            "AAD12" -> txt_AAD12
            "AAD17" -> txt_AAD17
            "AAD20" -> txt_AAD20
            "AAD23" -> txt_AAD23
            "AAD28" -> txt_AAD28
            "ABD4" -> txt_ABD4
            "ABD5" -> txt_ABD5
            "ABD9" -> txt_ABD9
            "ABD12" -> txt_ABD12
            "ABD17" -> txt_ABD17
            "ABD20" -> txt_ABD20
            "ABD23" -> txt_ABD23
            "ABD28" -> txt_ABD28
            else -> arrayOf()
        }
    }

    fun getCasualStyle(style: String): IntArray {
        return when (style) {
            "AAA4" -> AAA4
            "AAA5" -> AAA5
            "AAA9" -> AAA9
            "AAA12" -> AAA12
            "AAA17" -> AAA17
            "AAA20" -> AAA20
            "AAA23" -> AAA23
            "AAA28" -> AAA28
            "ABA4" -> ABA4
            "ABA5" -> ABA5
            "ABA9" -> ABA9
            "ABA12" -> ABA12
            "ABA17" -> ABA17
            "ABA20" -> ABA20
            "ABA23" -> ABA23
            "ABA28" -> ABA28
            else -> intArrayOf()
        }
    }

    fun getCasualStyleText(style: String): Array<String> {
        return when (style) {
            "AAA4" -> txt_AAA4
            "AAA5" -> txt_AAA5
            "AAA9" -> txt_AAA9
            "AAA12" -> txt_AAA12
            "AAA17" -> txt_AAA17
            "AAA20" -> txt_AAA20
            "AAA23" -> txt_AAA23
            "AAA28" -> txt_AAA28
            "ABA4" -> txt_ABA4
            "ABA5" -> txt_ABA5
            "ABA9" -> txt_ABA9
            "ABA12" -> txt_ABA12
            "ABA17" -> txt_ABA17
            "ABA20" -> txt_ABA20
            "ABA23" -> txt_ABA23
            "ABA28" -> txt_ABA28
            else -> arrayOf()
        }
    }

    fun getVintageStyle(style: String): IntArray {
        return when (style) {
            "AAB4" -> AAB4
            "AAB5" -> AAB5
            "AAB9" -> AAB9
            "AAB12" -> AAB12
            "AAB17" -> AAB17
            "AAB20" -> AAB20
            "AAB23" -> AAB23
            "AAB28" -> AAB28
            "ABB4" -> ABB4
            "ABB5" -> ABB5
            "ABB9" -> ABB9
            "ABB12" -> ABB12
            "ABB17" -> ABB17
            "ABB20" -> ABB20
            "ABB23" -> ABB23
            "ABB28" -> ABB28
            else -> intArrayOf()
        }
    }

    fun getVintageStyleText(style: String): Array<String> {
        return when (style) {
            "AAB4" -> txt_AAB4
            "AAB5" -> txt_AAB5
            "AAB9" -> txt_AAB9
            "AAB12" -> txt_AAB12
            "AAB17" -> txt_AAB17
            "AAB20" -> txt_AAB20
            "AAB23" -> txt_AAB23
            "AAB28" -> txt_AAB28
            "ABB4" -> txt_ABB4
            "ABB5" -> txt_ABB5
            "ABB9" -> txt_ABB9
            "ABB12" -> txt_ABB12
            "ABB17" -> txt_ABB17
            "ABB20" -> txt_ABB20
            "ABB23" -> txt_ABB23
            "ABB28" -> txt_ABB28
            else -> arrayOf()
        }
    }

    fun getSportyStyle(style: String): IntArray {
        return when (style) {
            "AAE4" -> AAE4
            "AAE5" -> AAE5
            "AAE9" -> AAE9
            "AAE12" -> AAE12
            "AAE17" -> AAE17
            "AAE20" -> AAE20
            "AAE23" -> AAE23
            "AAE28" -> AAE28
            "ABE4" -> ABE4
            "ABE5" -> ABE5
            "ABE9" -> ABE9
            "ABE12" -> ABE12
            "ABE17" -> ABE17
            "ABE20" -> ABE20
            "ABE23" -> ABE23
            "ABE28" -> ABE28
            else -> intArrayOf()
        }
    }

    fun getSportyStyleText(style: String): Array<String> {
        return when (style) {
            "AAE4" -> txt_AAE4
            "AAE5" -> txt_AAE5
            "AAE9" -> txt_AAE9
            "AAE12" -> txt_AAE12
            "AAE17" -> txt_AAE17
            "AAE20" -> txt_AAE20
            "AAE23" -> txt_AAE23
            "AAE28" -> txt_AAE28
            "ABE4" -> txt_ABE4
            "ABE5" -> txt_ABE5
            "ABE9" -> txt_ABE9
            "ABE12" -> txt_ABE12
            "ABE17" -> txt_ABE17
            "ABE20" -> txt_ABE20
            "ABE23" -> txt_ABE23
            "ABE28" -> txt_ABE28
            else -> arrayOf()
        }
    }

    fun getStreetStyle(style: String): IntArray {
        return when (style) {
            "AAC4" -> AAC4
            "AAC5" -> AAC5
            "AAC9" -> AAC9
            "AAC12" -> AAC12
            "AAC17" -> AAC17
            "AAC20" -> AAC20
            "AAC23" -> AAC23
            "AAC28" -> AAC28
            "ABC4" -> ABC4
            "ABC5" -> ABC5
            "ABC9" -> ABC9
            "ABC12" -> ABC12
            "ABC17" -> ABC17
            "ABC20" -> ABC20
            "ABC23" -> ABC23
            "ABC28" -> ABC28
            else -> intArrayOf()
        }
    }

    fun getStreetStyleText(style: String): Array<String> {
        return when (style) {
            "AAC4" -> txt_AAC4
            "AAC5" -> txt_AAC5
            "AAC9" -> txt_AAC9
            "AAC12" -> txt_AAC12
            "AAC17" -> txt_AAC17
            "AAC20" -> txt_AAC20
            "AAC23" -> txt_AAC23
            "AAC28" -> txt_AAC28
            "ABC4" -> txt_ABC4
            "ABC5" -> txt_ABC5
            "ABC9" -> txt_ABC9
            "ABC12" -> txt_ABC12
            "ABC17" -> txt_ABC17
            "ABC20" -> txt_ABC20
            "ABC23" -> txt_ABC23
            "ABC28" -> txt_ABC28
            else -> arrayOf()
        }
    }

    //***************************************************************************************************
    //4(),5(),9(),12(),17(),20(),23(),28()
    // TODO : 댄디 스타일.
    // TODO : 남자  더위많이탐 댄디 4도
    var AAD4 = intArrayOf(
        R.drawable.m_dandy_agneat,
        R.drawable.m_dandy_darkobneat,
        R.drawable.m_dandy_neat01,
        R.drawable.m_dandy_shorpadding,
        R.drawable.m_dandy_mossjacket,
        R.drawable.m_dandy_longpadding,
        R.drawable.m_dandy_deeppants,
        R.drawable.m_dandy_slacks,
        R.drawable.m_dandy_strebluejeans
    )
    var txt_AAD4 = arrayOf(
        "두꺼운 니트", "두꺼운 니트", "두꺼운 니트",
        "숏패딩", "두꺼운 자켓", "롱패딩",
        "기모 바지", "기모 슬랙스", "기모 청바지"
    )

    // 남자  더위많이탐 댄디 5도
    var AAD5 = intArrayOf(
        R.drawable.m_dandy_agneat,
        R.drawable.m_dandy_darkobneat,
        R.drawable.m_dandy_neat01,
        R.drawable.m_dandy_shorpadding,
        R.drawable.m_dandy_mossjacket,
        R.drawable.m_dandy_longpadding,
        R.drawable.m_dandy_deeppants,
        R.drawable.m_dandy_slacks,
        R.drawable.m_dandy_strebluejeans
    )
    var txt_AAD5 = arrayOf(
        "두꺼운 니트", "두꺼운 니트", "두꺼운 니트",
        "숏패딩", "두꺼운 자켓", "롱패딩",
        "기모 바지", "기모 슬랙스", "기모 청바지"
    )

    // 남자  더위많이탐 댄디 9도
    var AAD9 = intArrayOf(
        R.drawable.m_dandy_agneat, R.drawable.m_dandy_navyshirt, R.drawable.m_dandy_blueshirt,
        R.drawable.m_dandy_mossjacket, R.drawable.m_dandy_jumper, R.drawable.m_dandy_shorpadding,
        R.drawable.m_dandy_slacks, R.drawable.m_dandy_strebluejeans, R.drawable.m_dandy_deeppants
    )
    var txt_AAD9 = arrayOf(
        "얇은 니트", "셔츠", "셔츠",
        "두꺼운 자켓", "두꺼운 자켓", "숏패딩",
        "두꺼운 슬랙스", "두꺼운 연청바지", "두꺼운 진청바지"
    )

    // 남자  더위많이탐 댄디 12도
    var AAD12 = intArrayOf(
        R.drawable.m_dandy_darkobneat, R.drawable.m_dandy_agneat, R.drawable.m_dandy_neat01,
        R.drawable.m_dandy_jumper, R.drawable.m_dandy_strejacket, R.drawable.m_dandy_trkjacket,
        R.drawable.m_dandy_deeppants, R.drawable.m_dandy_slacks, R.drawable.m_dandy_strebluejeans
    )
    var txt_AAD12 = arrayOf(
        "얇은 니트", "얇은 니트", "얇은 니트",
        "얇은 자켓", "얇은 자켓", "얇은 자켓",
        "진청바지", "슬랙스", "연청바지"
    )

    // 남자  더위많이탐 댄디 17도
    var AAD17 = intArrayOf(
        R.drawable.m_dandy_navyshirt, R.drawable.m_dandy_obshirt, R.drawable.m_dandy_blueshirt,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.m_dandy_deeppants, R.drawable.m_dandy_slacks, R.drawable.m_dandy_strebluejeans
    )
    var txt_AAD17 = arrayOf(
        "얇은 셔츠", "오버핏 셔츠", "얇은 셔츠",
        "", "", "",
        "진청바지", "슬랙스", "연청바지"
    )

    // 남자  더위많이탐 댄디 20도
    var AAD20 = intArrayOf(
        R.drawable.m_dandy_banshirt, R.drawable.m_dandy_ban, R.drawable.m_dandy_navyshirt,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.m_dandy_banpants, R.drawable.m_dandy_fatigueshorts, R.drawable.m_dandy_slacks
    )
    var txt_AAD20 = arrayOf(
        "얇은 셔츠", "반팔", "얇은 셔츠",
        "", "", "",
        "슬랙스반바지", "얇은 면반바지", "얇은 슬랙스"
    )

    // 남자  더위많이탐 댄디 23도
    var AAD23 = intArrayOf(
        R.drawable.m_dandy_banshirt, R.drawable.m_dandy_ban, R.drawable.m_dandy_navyshirt,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.m_dandy_banpants, R.drawable.m_dandy_fatigueshorts, R.drawable.m_dandy_banslacks
    )
    var txt_AAD23 = arrayOf(
        "얇은 셔츠", "반팔", "얇은 셔츠",
        "", "", "",
        "슬랙스반바지", "얇은 면반바지", "반바지"
    )

    // 남자  더위많이탐 댄디 28도
    var AAD28 = intArrayOf(
        R.drawable.m_dandy_banshirt, R.drawable.m_dandy_ban, R.drawable.ic_xxx,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.m_dandy_banpants, R.drawable.m_dandy_fatigueshorts, R.drawable.m_dandy_banslacks
    )
    var txt_AAD28 = arrayOf(
        "얇은 셔츠", "반팔", "",
        "", "", "",
        "슬랙스반바지", "얇은 면반바지", "반바지"
    )

    // 남자  더위적게탐 댄디 4도
    var ABD4 = intArrayOf(
        R.drawable.m_dandy_agneat,
        R.drawable.m_dandy_darkobneat,
        R.drawable.m_dandy_neat01,
        R.drawable.m_dandy_shorpadding,
        R.drawable.m_dandy_mossjacket,
        R.drawable.m_dandy_longpadding,
        R.drawable.m_dandy_deeppants,
        R.drawable.m_dandy_slacks,
        R.drawable.m_dandy_strebluejeans
    )
    var txt_ABD4 = arrayOf(
        "두꺼운 니트", "두꺼운 니트", "두꺼운 니트",
        "숏패딩", "두꺼운 자켓", "롱패딩",
        "기모 바지", "기모 슬랙스", "기모 청바지"
    )

    // 남자  더위적게탐 댄디 5도
    var ABD5 = intArrayOf(
        R.drawable.m_dandy_agneat,
        R.drawable.m_dandy_darkobneat,
        R.drawable.m_dandy_neat01,
        R.drawable.m_dandy_shorpadding,
        R.drawable.m_dandy_mossjacket,
        R.drawable.m_dandy_longpadding,
        R.drawable.m_dandy_deeppants,
        R.drawable.m_dandy_slacks,
        R.drawable.m_dandy_strebluejeans
    )
    var txt_ABD5 = arrayOf(
        "두꺼운 니트", "두꺼운 니트", "두꺼운 니트",
        "숏패딩", "두꺼운 자켓", "롱패딩",
        "기모 바지", "기모 슬랙스", "기모 청바지"
    )

    // 남자  더위적게탐 댄디 9도
    var ABD9 = intArrayOf(
        R.drawable.m_dandy_agneat, R.drawable.m_dandy_navyshirt, R.drawable.m_dandy_blueshirt,
        R.drawable.m_dandy_mossjacket, R.drawable.m_dandy_jumper, R.drawable.m_dandy_shorpadding,
        R.drawable.m_dandy_slacks, R.drawable.m_dandy_strebluejeans, R.drawable.m_dandy_deeppants
    )
    var txt_ABD9 = arrayOf(
        "얇은 니트", "셔츠", "셔츠",
        "두꺼운 자켓", "두꺼운 자켓", "숏패딩",
        "두꺼운 슬랙스", "두꺼운 연청바지", "두꺼운 진청바지"
    )

    // 남자  더위적게탐 댄디 12도
    var ABD12 = intArrayOf(
        R.drawable.m_dandy_darkobneat, R.drawable.m_dandy_agneat, R.drawable.m_dandy_neat01,
        R.drawable.m_dandy_jumper, R.drawable.m_dandy_strejacket, R.drawable.m_dandy_trkjacket,
        R.drawable.m_dandy_deeppants, R.drawable.m_dandy_slacks, R.drawable.m_dandy_strebluejeans
    )
    var txt_ABD12 = arrayOf(
        "니트", "두꺼운 니트", "두꺼운 니트",
        "얇은 자켓", "얇은 자켓", "두꺼운 자켓",
        "두꺼운 진청바지", "두꺼운 슬랙스", "두꺼운 연청바지"
    )

    // 남자  더위적게탐 댄디 17도
    var ABD17 = intArrayOf(
        R.drawable.m_dandy_navyshirt, R.drawable.m_dandy_neat, R.drawable.m_dandy_blueshirt,
        R.drawable.m_dandy_strejacket, R.drawable.m_dandy_trkjacket, R.drawable.m_dandy_jumper,
        R.drawable.m_dandy_deeppants, R.drawable.m_dandy_slacks, R.drawable.m_dandy_strebluejeans
    )
    var txt_ABD17 = arrayOf(
        "셔츠", "오버핏 셔츠", "셔츠",
        "얇은 자켓", "얇은 자켓", "얇은 점퍼",
        "진청바지", "슬랙스", "연청바지"
    )

    // 남자  더위적게탐 댄디 20도
    var ABD20 = intArrayOf(
        R.drawable.m_dandy_banshirt, R.drawable.m_dandy_obshirt, R.drawable.m_dandy_navyshirt,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.m_dandy_slacks, R.drawable.m_dandy_strebluejeans, R.drawable.m_dandy_deeppants
    )
    var txt_ABD20 = arrayOf(
        "얇은 셔츠", "오버핏 셔츠", "얇은 셔츠",
        "", "", "",
        "슬랙스", "연청바지", "진청바지"
    )

    // 남자  더위적게탐 댄디 23도
    var ABD23 = intArrayOf(
        R.drawable.m_dandy_banshirt, R.drawable.m_dandy_ban, R.drawable.m_dandy_navyshirt,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.m_dandy_banpants, R.drawable.m_dandy_fatigueshorts, R.drawable.m_dandy_banslacks
    )
    var txt_ABD23 = arrayOf(
        "얇은 셔츠", "반팔", "얇은 셔츠",
        "", "", "",
        "슬랙스반바지", "얇은 면반바지", "반바지"
    )

    // 남자  더위적게탐 댄디 28도
    var ABD28 = intArrayOf(
        R.drawable.m_dandy_banshirt, R.drawable.m_dandy_ban, R.drawable.m_dandy_navyshirt,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.m_dandy_banpants, R.drawable.m_dandy_fatigueshorts, R.drawable.m_dandy_banslacks
    )
    var txt_ABD28 = arrayOf(
        "얇은 셔츠", "반팔", "얇은 셔츠",
        "", "", "",
        "슬랙스반바지", "얇은 면반바지", "반바지"
    )

    //***************************************************************************************************
    // TODO : 캐주얼 스타일.
    // 남자  더위많이탐 캐주얼 4도
    var AAA4 = intArrayOf(
        R.drawable.m_casual_rugbyshirts, R.drawable.m_casual_overman, R.drawable.m_casual_gmantoman,
        R.drawable.m_casual_longpadding, R.drawable.m_casual_sropadding, R.drawable.ic_xxx,
        R.drawable.m_casual_jeans, R.drawable.m_casual_jogger, R.drawable.ic_xxx
    )
    var txt_AAA4 = arrayOf(
        "두꺼운 셔츠", "두꺼운 맨투맨", "두꺼운 맨투맨",
        "롱패딩", "숏패딩", "",
        "기모 청바지", "기모 바지", ""
    )

    // 남자  더위많이탐 캐주얼 5도
    var AAA5 = intArrayOf(
        R.drawable.m_casual_stripeshirt, R.drawable.m_casual_gmantoman, R.drawable.m_casual_overman,
        R.drawable.m_casual_sropadding, R.drawable.m_casual_arcticcoat, R.drawable.ic_xxx,
        R.drawable.m_dandy_strebluejeans, R.drawable.m_casual_jogger, R.drawable.m_casual_khakipants
    )
    var txt_AAA5 = arrayOf(
        "두꺼운 셔츠", "두꺼운 맨투맨", "오버핏 맨투맨",
        "숏패딩", "두꺼운 코트", "",
        "기모 청바지", "기모 바지", "기모 바지"
    )

    // 남자  더위많이탐 캐주얼 9도
    var AAA9 = intArrayOf(
        R.drawable.m_casual_gmantoman, R.drawable.m_casual_stripeshirt, R.drawable.m_casual_overman,
        R.drawable.m_casual_darkjacket, R.drawable.m_casual_olivejacket, R.drawable.ic_xxx,
        R.drawable.m_casual_jogger, R.drawable.m_dandy_strebluejeans, R.drawable.m_casual_khakipants
    )
    var txt_AAA9 = arrayOf(
        "두꺼운 맨투맨", "두꺼운 셔츠", "두꺼운 맨투맨",
        "얇은 자켓", "자켓", "",
        "두꺼운 바지", "두꺼운 바지", "두꺼운 바지"
    )

    // 남자  더위많이탐 캐주얼 12도
    var AAA12 = intArrayOf(
        R.drawable.m_casual_overman, R.drawable.m_casual_gmantoman, R.drawable.ic_xxx,
        R.drawable.m_casual_olivejacket, R.drawable.m_casual_darkjacket, R.drawable.ic_xxx,
        R.drawable.m_casual_jogger, R.drawable.m_casual_khakipants, R.drawable.m_casual_jeans
    )
    var txt_AAA12 = arrayOf(
        "맨투맨", "긴티", "",
        "얇은 자켓", "얇은 자켓", "",
        "긴 바지", "긴 바지", "긴 바지"
    )

    // 남자  더위많이탐 캐주얼 17도
    var AAA17 = intArrayOf(
        R.drawable.m_casual_overman, R.drawable.m_casual_gmantoman, R.drawable.ic_xxx,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.m_casual_jogger, R.drawable.m_casual_khakipants, R.drawable.ic_xxx
    )
    var txt_AAA17 = arrayOf(
        "맨투맨", "긴티", "",
        "", "", "",
        "긴 바지", "긴 바지", ""
    )

    // 남자  더위많이탐 캐주얼 20도
    var AAA20 = intArrayOf(
        R.drawable.blue_short, R.drawable.black_short, R.drawable.charcoal_short,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.m_dandy_banpants, R.drawable.m_casual_deepbluepants, R.drawable.m_casual_jogger
    )
    var txt_AAA20 = arrayOf(
        "반팔", "반팔", "반팔",
        "", "", "",
        "반바지", "청반바지", "얇은 바지"
    )

    // 남자  더위많이탐 캐주얼 23도
    var AAA23 = intArrayOf(
        R.drawable.gray_short,
        R.drawable.m_casual_sleeveshort,
        R.drawable.pupple_short,
        R.drawable.ic_xxx,
        R.drawable.ic_xxx,
        R.drawable.ic_xxx,
        R.drawable.m_casual_khakipants,
        R.drawable.sporty_shortpants,
        R.drawable.m_casual_deepbluepants
    )
    var txt_AAA23 = arrayOf(
        "반팔", "반팔", "반팔",
        "", "", "",
        "얇은 면바지", "반바지", "얇은 청반바지"
    )

    // 남자  더위많이탐 캐주얼 28도
    var AAA28 = intArrayOf(
        R.drawable.yellow_short, R.drawable.m_casual_sleeveshort, R.drawable.charcoal_short,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.m_casual_deepbluepants, R.drawable.sporty_shortpants, R.drawable.ic_xxx
    )
    var txt_AAA28 = arrayOf(
        "반팔", "반팔", "반팔",
        "", "", "",
        "얇은 청반바지", "반바지", ""
    )

    // 남자  더위적게탐 캐주얼 4도
    var ABA4 = intArrayOf(
        R.drawable.m_casual_rugbyshirts, R.drawable.m_casual_overman, R.drawable.m_casual_gmantoman,
        R.drawable.m_casual_longpadding, R.drawable.m_casual_sropadding, R.drawable.ic_xxx,
        R.drawable.m_casual_jeans, R.drawable.m_casual_jogger, R.drawable.ic_xxx
    )
    var txt_ABA4 = arrayOf(
        "두꺼운 셔츠", "두꺼운 맨투맨", "두꺼운 맨투맨",
        "롱패딩", "숏패딩", "",
        "기모 청바지", "기모 바지", ""
    )

    // 남자  더위적게탐 캐주얼 5도
    var ABA5 = intArrayOf(
        R.drawable.m_casual_stripeshirt,
        R.drawable.m_casual_gmantoman,
        R.drawable.m_casual_overman,
        R.drawable.m_casual_sropadding,
        R.drawable.m_casual_arcticcoat,
        R.drawable.m_casual_longpadding,
        R.drawable.sporty_shortpants,
        R.drawable.m_casual_jogger,
        R.drawable.m_casual_khakipants
    )
    var txt_ABA5 = arrayOf(
        "두꺼운 셔츠", "두꺼운 맨투맨", "오버핏 맨투맨",
        "숏패딩", "두꺼운 코트", "",
        "기모 바지", "기모 바지", "기모 바지"
    )

    // 남자  더위적게탐 캐주얼 9도
    var ABA9 = intArrayOf(
        R.drawable.m_casual_gmantoman,
        R.drawable.m_casual_stripeshirt,
        R.drawable.m_casual_overman,
        R.drawable.m_casual_darkjacket,
        R.drawable.m_casual_arcticcoat,
        R.drawable.m_casual_sropadding,
        R.drawable.m_casual_jogger,
        R.drawable.m_dandy_strebluejeans,
        R.drawable.m_casual_khakipants
    )
    var txt_ABA9 = arrayOf(
        "두꺼운 맨투맨", "두꺼운 셔츠", "두꺼운 맨투맨",
        "두꺼운 자켓", "두꺼운 코트", "숏패딩",
        "두꺼운 바지", "두꺼운 청바지", "두꺼운 바지"
    )

    // 남자  더위적게탐 캐주얼 12도
    var ABA12 = intArrayOf(
        R.drawable.m_casual_overman, R.drawable.m_casual_gmantoman, R.drawable.ic_xxx,
        R.drawable.m_casual_olivejacket, R.drawable.m_casual_darkjacket, R.drawable.ic_xxx,
        R.drawable.m_casual_jogger, R.drawable.m_casual_khakipants, R.drawable.m_casual_jeans
    )
    var txt_ABA12 = arrayOf(
        "맨투맨", "긴티", "",
        "자켓", "자켓", "",
        "바지", "면바지", "바지"
    )

    // 남자  더위적게탐 캐주얼 17도
    var ABA17 = intArrayOf(
        R.drawable.m_casual_overman, R.drawable.m_casual_gmantoman, R.drawable.ic_xxx,
        R.drawable.m_casual_olivejacket, R.drawable.m_casual_hooded, R.drawable.ic_xxx,
        R.drawable.m_casual_jeans, R.drawable.m_casual_jogger, R.drawable.m_casual_khakipants
    )
    var txt_ABA17 = arrayOf(
        "맨투맨", "긴티", "",
        "얇은 자켓", "얇은 후드자켓", "",
        "바지", "바지", "면바지"
    )

    // 남자  더위적게탐 캐주얼 20도
    var ABA20 = intArrayOf(
        R.drawable.blue_short, R.drawable.black_short, R.drawable.charcoal_short,
        R.drawable.m_casual_hooded, R.drawable.m_casual_olivejacket, R.drawable.m_casual_darkjacket,
        R.drawable.sporty_shortpants, R.drawable.m_casual_deepbluepants, R.drawable.m_casual_jogger
    )
    var txt_ABA20 = arrayOf(
        "반팔", "반팔", "반팔",
        "얇은 후드자켓", "얇은 자켓", "얇은 자켓",
        "반바지", "청반바지", "얇은 바지"
    )

    // 남자  더위적게탐 캐주얼 23도
    var ABA23 = intArrayOf(
        R.drawable.gray_short,
        R.drawable.m_casual_sleeveshort,
        R.drawable.pupple_short,
        R.drawable.ic_xxx,
        R.drawable.ic_xxx,
        R.drawable.ic_xxx,
        R.drawable.m_casual_khakipants,
        R.drawable.sporty_shortpants,
        R.drawable.m_casual_deepbluepants
    )
    var txt_ABA23 = arrayOf(
        "반팔", "반팔", "반팔",
        "", "", "",
        "얇은 면바지", "반바지", "청반바지"
    )

    // 남자  더위적게탐 캐주얼 28도
    var ABA28 = intArrayOf(
        R.drawable.yellow_short, R.drawable.m_casual_sleeveshort, R.drawable.charcoal_short,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.m_casual_deepbluepants, R.drawable.sporty_shortpants, R.drawable.ic_xxx
    )
    var txt_ABA28 = arrayOf(
        "반팔", "반팔", "반팔",
        "", "", "",
        "청반바지", "반바지", ""
    )

    //***************************************************************************************************
    // TODO : 스포티 스타일 AAE, ABE
    // TODO : 남 더위많이탐 스포티 4도
    var AAE4 = intArrayOf(
        R.drawable.black_long, R.drawable.sporty_blackmtm, R.drawable.ic_xxx,
        R.drawable.sporty_trainingheavyouter, R.drawable.sheep_shortpadding, R.drawable.longpadding,
        R.drawable.sporty_trainingpants, R.drawable.ic_xxx, R.drawable.ic_xxx
    )
    var txt_AAE4 = arrayOf(
        "긴팔", "기모 맨투맨", "",
        "두꺼운 자켓", "양털 숏패딩", "롱패딩",
        "기모 바지", "", ""
    )
    var AAE5 = intArrayOf(
        R.drawable.black_long, R.drawable.sporty_blackmtm, R.drawable.ic_xxx,
        R.drawable.sporty_trainingheavyouter, R.drawable.sheep_shortpadding, R.drawable.longpadding,
        R.drawable.sporty_trainingpants, R.drawable.ic_xxx, R.drawable.ic_xxx
    )
    var txt_AAE5 = arrayOf(
        "긴팔", "기모 맨투맨", "",
        "두꺼운 자켓", "양털 숏패딩", "롱패딩",
        "기모 바지", "", ""
    )
    var AAE9 = intArrayOf(
        R.drawable.black_long, R.drawable.sporty_blackmtm, R.drawable.white_tshort,
        R.drawable.sporty_thinouter, R.drawable.sporty_trainingouter, R.drawable.ic_xxx,
        R.drawable.sporty_jogger, R.drawable.sporty_trainingpants, R.drawable.ic_xxx
    )
    var txt_AAE9 = arrayOf(
        "긴팔", "맨투맨", "반팔",
        "자켓", "트레이닝복", "",
        "두꺼운 조거 팬츠", "두꺼운 트레이닝 바지", ""
    )
    var AAE12 = intArrayOf(
        R.drawable.black_long, R.drawable.sporty_blackmtm, R.drawable.white_tshort,
        R.drawable.sporty_thinouter, R.drawable.sporty_trainingouter, R.drawable.ic_xxx,
        R.drawable.sporty_jogger, R.drawable.sporty_trainingpants, R.drawable.ic_xxx
    )
    var txt_AAE12 = arrayOf(
        "긴팔", "맨투맨", "반팔",
        "얇은 자켓", "트레이닝복", "",
        "조거 팬츠", "트레이닝 바지", ""
    )
    var AAE17 = intArrayOf(
        R.drawable.black_short, R.drawable.white_tshort, R.drawable.pupple_short,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.sporty_jogger, R.drawable.sporty_trainingpants, R.drawable.ic_xxx
    )
    var txt_AAE17 = arrayOf(
        "반팔", "반팔", "반팔",
        "", "", "",
        "조거 팬츠", "트레이닝 바지", ""
    )
    var AAE20 = intArrayOf(
        R.drawable.black_short, R.drawable.white_tshort, R.drawable.pupple_short,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.sporty_jogger, R.drawable.sporty_trainingpants, R.drawable.ic_xxx
    )
    var txt_AAE20 = arrayOf(
        "반팔", "반팔", "반팔",
        "", "", "",
        "얇은 조거 팬츠", "얇은 트레이닝 바지", ""
    )
    var AAE23 = intArrayOf(
        R.drawable.white_nasi, R.drawable.white_tshort, R.drawable.ic_xxx,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.sporty_shortpants, R.drawable.sporty_trainingpants, R.drawable.ic_xxx
    )
    var txt_AAE23 = arrayOf(
        "나시", "반팔", "",
        "", "", "",
        "반바지", "얇은 트레이닝 바지", ""
    )
    var AAE28 = intArrayOf(
        R.drawable.m_sporty_nasi, R.drawable.white_nasi, R.drawable.white_tshort,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.sporty_shortpants, R.drawable.sporty_trainingpants, R.drawable.ic_xxx
    )
    var txt_AAE28 = arrayOf(
        "나시", "나시", "반팔",
        "", "", "",
        "반바지", "얇은 트레이닝 바지", ""
    )

    // 남 더위적게탐 스포티 4도
    var ABE4 = intArrayOf(
        R.drawable.black_long, R.drawable.sporty_blackmtm, R.drawable.ic_xxx,
        R.drawable.sporty_trainingheavyouter, R.drawable.sheep_shortpadding, R.drawable.longpadding,
        R.drawable.sporty_trainingpants, R.drawable.ic_xxx, R.drawable.ic_xxx
    )
    var txt_ABE4 = arrayOf(
        "긴팔", "기모 맨투맨", "",
        "두꺼운 자켓, 양털 숏패딩", "롱패딩",
        "기모 바지", "", ""
    )
    var ABE5 = intArrayOf(
        R.drawable.black_long, R.drawable.sporty_blackmtm, R.drawable.ic_xxx,
        R.drawable.sporty_trainingheavyouter, R.drawable.sheep_shortpadding, R.drawable.longpadding,
        R.drawable.sporty_trainingpants, R.drawable.ic_xxx, R.drawable.ic_xxx
    )
    var txt_ABE5 = arrayOf(
        "긴팔", "기모 맨투맨", "",
        "두꺼운 자켓, 양털 숏패딩", "롱패딩",
        "기모 바지", "", ""
    )
    var ABE9 = intArrayOf(
        R.drawable.black_long, R.drawable.sporty_blackmtm, R.drawable.white_tshort,
        R.drawable.sporty_thinouter, R.drawable.sporty_trainingouter, R.drawable.ic_xxx,
        R.drawable.sporty_jogger, R.drawable.sporty_trainingpants, R.drawable.ic_xxx
    )
    var txt_ABE9 = arrayOf(
        "긴팔", "맨투맨", "반팔",
        "자켓", "트레이닝복", "",
        "두꺼운 조거 팬츠", "두꺼운 트레이닝 바지", ""
    )
    var ABE12 = intArrayOf(
        R.drawable.black_long, R.drawable.sporty_blackmtm, R.drawable.white_tshort,
        R.drawable.sporty_thinouter, R.drawable.sporty_trainingouter, R.drawable.ic_xxx,
        R.drawable.sporty_jogger, R.drawable.sporty_trainingpants, R.drawable.ic_xxx
    )
    var txt_ABE12 = arrayOf(
        "긴팔", "맨투맨", "반팔",
        "얇은 자켓", "트레이닝복", "",
        "조거 팬츠", "트레이닝 바지", ""
    )
    var ABE17 = intArrayOf(
        R.drawable.black_short, R.drawable.white_tshort, R.drawable.pupple_short,
        R.drawable.sporty_thinouter, R.drawable.sporty_trainingouter, R.drawable.ic_xxx,
        R.drawable.sporty_jogger, R.drawable.sporty_trainingpants, R.drawable.ic_xxx
    )
    var txt_ABE17 = arrayOf(
        "반팔", "반팔", "반팔",
        "얇은 자켓", "트레이닝복", "",
        "얇은 조거 팬츠", "얇은 트레이닝 바지", ""
    )
    var ABE20 = intArrayOf(
        R.drawable.black_short, R.drawable.white_tshort, R.drawable.pupple_short,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.sporty_jogger, R.drawable.sporty_trainingpants, R.drawable.ic_xxx
    )
    var txt_ABE20 = arrayOf(
        "반팔", "반팔", "반팔",
        "", "", "",
        "얇은 조거 팬츠", "얇은 트레이닝 바지", ""
    )
    var ABE23 = intArrayOf(
        R.drawable.white_nasi, R.drawable.white_tshort, R.drawable.ic_xxx,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.sporty_shortpants, R.drawable.sporty_trainingpants, R.drawable.ic_xxx
    )
    var txt_ABE23 = arrayOf(
        "나시", "반팔", "",
        "", "", "",
        "반바지", "얇은 트레이닝 바지", ""
    )
    var ABE28 = intArrayOf(
        R.drawable.m_sporty_nasi, R.drawable.white_nasi, R.drawable.white_tshort,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.sporty_shortpants, R.drawable.sporty_trainingpants, R.drawable.ic_xxx
    )
    var txt_ABE28 = arrayOf(
        "나시", "나시", "반팔",
        "", "", "",
        "반바지", "얇은 트레이닝 바지", ""
    )

    //***************************************************************************************************
    // TODO : 빈티지 스타일 AAB, ABB
    // TODO : 남 더위많이탐 빈티지
    var AAB4 = intArrayOf(
        R.drawable.f_vintage_longshirt, R.drawable.vintage_longshirt, R.drawable.ic_xxx,
        R.drawable.vintage_heavyouter2, R.drawable.vintage_shortpadding, R.drawable.longpadding,
        R.drawable.vintage_jean, R.drawable.vintage_pants, R.drawable.ic_xxx
    )
    var txt_AAB4 = arrayOf(
        "긴팔 셔츠", "긴팔 셔츠", "",
        "헤비 코트", "숏패딩", "롱패딩",
        "기모 청바지", "기모 면바지", ""
    )
    var AAB5 = intArrayOf(
        R.drawable.f_vintage_longshirt, R.drawable.vintage_longshirt, R.drawable.ic_xxx,
        R.drawable.vintage_heavyouter2, R.drawable.vintage_shortpadding, R.drawable.longpadding,
        R.drawable.vintage_jean, R.drawable.vintage_pants, R.drawable.ic_xxx
    )
    var txt_AAB5 = arrayOf(
        "긴팔 셔츠", "긴팔 셔츠", "",
        "헤비 코트", "숏패딩", "롱패딩",
        "기모 청바지", "기모 면바지", ""
    )
    var AAB9 = intArrayOf(
        R.drawable.f_vintage_longshirt, R.drawable.vintage_longshirt, R.drawable.ic_xxx,
        R.drawable.vintage_heavyouter2, R.drawable.vintage_heavyouter, R.drawable.ic_xxx,
        R.drawable.vintage_jean, R.drawable.vintage_pants, R.drawable.ic_xxx
    )
    var txt_AAB9 = arrayOf(
        "긴팔 셔츠", "긴팔 셔츠", "",
        "헤비 코트", "헤비 코트", "",
        "두꺼운 청바지", "두꺼운 면바지", ""
    )
    var AAB12 = intArrayOf(
        R.drawable.f_vintage_longshirt, R.drawable.vintage_longshirt, R.drawable.ic_xxx,
        R.drawable.vintage_heavyouter2, R.drawable.vintage_heavyouter, R.drawable.ic_xxx,
        R.drawable.vintage_jean, R.drawable.vintage_pants, R.drawable.ic_xxx
    )
    var txt_AAB12 = arrayOf(
        "긴팔 셔츠", "긴팔 셔츠", "",
        "헤비 코트", "헤비 코트", "",
        "청바지", "면바지", ""
    )
    var AAB17 = intArrayOf(
        R.drawable.f_vintage_longshirt, R.drawable.vintage_shorttshirt2, R.drawable.yellow_short,
        R.drawable.f_vintage_longshirt, R.drawable.vintage_longshirt, R.drawable.vintage_gardigun,
        R.drawable.vintage_jean, R.drawable.vintage_pants, R.drawable.ic_xxx
    )
    var txt_AAB17 = arrayOf(
        "반팔", "반팔", "반팔",
        "긴팔 셔츠", "긴팔 셔츠", "가디건",
        "청바지", "면바지", ""
    )
    var AAB20 = intArrayOf(
        R.drawable.f_vintage_longshirt, R.drawable.vintage_shorttshirt2, R.drawable.yellow_short,
        R.drawable.f_vintage_longshirt, R.drawable.vintage_longshirt, R.drawable.vintage_gardigun,
        R.drawable.vintage_jean, R.drawable.vintage_pants, R.drawable.ic_xxx
    )
    var txt_AAB20 = arrayOf(
        "반팔", "반팔", "반팔",
        "긴팔 셔츠", "긴팔 셔츠", "가디건",
        "얇은 청바지", "얇은 면바지", ""
    )
    var AAB23 = intArrayOf(
        R.drawable.blue_short, R.drawable.vintage_shortshirt, R.drawable.ic_xxx,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.vintage_shortpants, R.drawable.vintage_jean, R.drawable.vintage_pants
    )
    var txt_AAB23 = arrayOf(
        "반팔", "반팔", "반팔",
        "", "", "",
        "반바지", "얇은 청바지", "얇은 바지"
    )
    var AAB28 = intArrayOf(
        R.drawable.blue_short, R.drawable.vintage_shortshirt, R.drawable.ic_xxx,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.vintage_shortpants, R.drawable.vintage_shortpants2, R.drawable.vintage_pants
    )
    var txt_AAB28 = arrayOf(
        "반팔", "반팔", "반팔",
        "", "", "",
        "반바지", "반바지", "얇은 바지"
    )

    // 남 더위적게탐 빈티지
    var ABB4 = intArrayOf(
        R.drawable.f_vintage_longshirt, R.drawable.vintage_longshirt, R.drawable.ic_xxx,
        R.drawable.vintage_heavyouter2, R.drawable.vintage_shortpadding, R.drawable.longpadding,
        R.drawable.vintage_jean, R.drawable.vintage_pants, R.drawable.ic_xxx
    )
    var txt_ABB4 = arrayOf(
        "긴팔 셔츠", "긴팔 셔츠", "",
        "헤비 코트", "숏패딩", "롱패딩",
        "기모 청바지", "기모 면바지", ""
    )
    var ABB5 = intArrayOf(
        R.drawable.f_vintage_longshirt, R.drawable.vintage_longshirt, R.drawable.ic_xxx,
        R.drawable.vintage_heavyouter2, R.drawable.vintage_shortpadding, R.drawable.longpadding,
        R.drawable.vintage_jean, R.drawable.vintage_pants, R.drawable.ic_xxx
    )
    var txt_ABB5 = arrayOf(
        "긴팔 셔츠", "긴팔 셔츠", "",
        "헤비 코트", "숏패딩", "롱패딩",
        "기모 청바지", "기모 면바지", ""
    )
    var ABB9 = intArrayOf(
        R.drawable.f_vintage_longshirt, R.drawable.vintage_longshirt, R.drawable.ic_xxx,
        R.drawable.vintage_heavyouter2, R.drawable.vintage_heavyouter, R.drawable.ic_xxx,
        R.drawable.vintage_jean, R.drawable.vintage_pants, R.drawable.ic_xxx
    )
    var txt_ABB9 = arrayOf(
        "긴팔 셔츠", "긴팔 셔츠", "",
        "헤비 코트", "헤비 코트", "",
        "두꺼운 청바지", "두꺼운 면바지", ""
    )
    var ABB12 = intArrayOf(
        R.drawable.f_vintage_longshirt, R.drawable.vintage_longshirt, R.drawable.ic_xxx,
        R.drawable.vintage_heavyouter2, R.drawable.vintage_heavyouter, R.drawable.ic_xxx,
        R.drawable.vintage_jean, R.drawable.vintage_pants, R.drawable.ic_xxx
    )
    var txt_ABB12 = arrayOf(
        "긴팔 셔츠", "긴팔 셔츠", "",
        "헤비 코트", "헤비 코트", "",
        "청바지", "면바지", ""
    )
    var ABB17 = intArrayOf(
        R.drawable.f_vintage_longshirt, R.drawable.vintage_shorttshirt2, R.drawable.yellow_short,
        R.drawable.f_vintage_longshirt, R.drawable.vintage_longshirt, R.drawable.vintage_gardigun,
        R.drawable.vintage_jean, R.drawable.vintage_pants, R.drawable.ic_xxx
    )
    var txt_ABB17 = arrayOf(
        "반팔", "반팔", "반팔",
        "긴팔 셔츠", "긴팔 셔츠", "가디건",
        "청바지", "면바지", ""
    )
    var ABB20 = intArrayOf(
        R.drawable.f_vintage_longshirt, R.drawable.vintage_shorttshirt2, R.drawable.yellow_short,
        R.drawable.f_vintage_longshirt, R.drawable.vintage_longshirt, R.drawable.vintage_gardigun,
        R.drawable.vintage_jean, R.drawable.vintage_pants, R.drawable.ic_xxx
    )
    var txt_ABB20 = arrayOf(
        "반팔", "반팔", "반팔",
        "긴팔 셔츠", "긴팔 셔츠", "가디건",
        "청바지", "면바지", ""
    )
    var ABB23 = intArrayOf(
        R.drawable.blue_short, R.drawable.vintage_shortshirt, R.drawable.ic_xxx,
        R.drawable.f_vintage_longshirt, R.drawable.vintage_longshirt, R.drawable.ic_xxx,
        R.drawable.vintage_shortpants, R.drawable.vintage_jean, R.drawable.vintage_pants
    )
    var txt_ABB23 = arrayOf(
        "반팔", "반팔", "반팔",
        "반팔 대신 셔츠", "반팔 대신 셔츠", "",
        "반바지", "얇은 청바지", "얇은 바지"
    )
    var ABB28 = intArrayOf(
        R.drawable.blue_short, R.drawable.vintage_shortshirt, R.drawable.ic_xxx,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.vintage_shortpants, R.drawable.vintage_shortpants2, R.drawable.vintage_pants
    )
    var txt_ABB28 = arrayOf(
        "반팔", "반팔", "반팔",
        "", "", "",
        "반바지", "반바지", "얇은 바지"
    )

    //***************************************************************************************************
    // TODO : 스트릿 스타일
    // TODO : 남 더위많이탐 스트릿 AAC ABC
    var AAC4 = intArrayOf(
        R.drawable.street_warm_hood, R.drawable.street_warm_knet, R.drawable.street_warm_neck,
        R.drawable.street_short_padding, R.drawable.street_mustang, R.drawable.street_baseball,
        R.drawable.street_jogger, R.drawable.street_cago, R.drawable.street_sweat_pants
    )
    var txt_AAC4 = arrayOf(
        "기모 후드티", "니트", "목폴람티",
        "숏패딩", "무스탕", "바시티 자켓",
        "기모 조거 팬츠", "기모 카고 팬츠", "기모 스웻 팬츠"
    )
    var AAC5 = intArrayOf(
        R.drawable.street_warm_hood, R.drawable.street_warm_knet, R.drawable.street_warm_neck,
        R.drawable.street_short_padding, R.drawable.street_mustang, R.drawable.street_baseball,
        R.drawable.street_jogger, R.drawable.street_cago, R.drawable.street_sweat_pants
    )
    var txt_AAC5 = arrayOf(
        "기모 후드티", "니트", "목폴람티",
        "숏패딩", "무스탕", "바시티 자켓",
        "기모 조거 팬츠", "기모 카고 팬츠", "기모 스웻 팬츠"
    )
    var AAC9 = intArrayOf(
        R.drawable.street_warm_hood, R.drawable.street_warm_knet, R.drawable.street_t_shirt,
        R.drawable.street_denim_jacket, R.drawable.street_jacket, R.drawable.street_anorak,
        R.drawable.street_jogger, R.drawable.street_cago, R.drawable.street_trainning
    )
    var txt_AAC9 = arrayOf(
        "기모 후드티", "니트", "긴팔티",
        "데님 자켓", "블루종/Ma-1", "아노락",
        "두꺼운 조거 팬츠", "두꺼운 카고 팬츠", "두꺼운 트레이닝바지"
    )
    var AAC12 = intArrayOf(
        R.drawable.street_hood, R.drawable.street_warm_knet, R.drawable.street_t_shirt,
        R.drawable.street_denim_jacket, R.drawable.street_jacket, R.drawable.street_anorak,
        R.drawable.street_wide_denim, R.drawable.street_cago, R.drawable.street_trainning
    )
    var txt_AAC12 = arrayOf(
        "후드티", "니트", "긴팔티",
        "데님 자켓", "블루종/Ma-1", "아노락",
        "청바지", "카고 팬츠", "트레이닝바지"
    )
    var AAC17 = intArrayOf(
        R.drawable.street_hood, R.drawable.street_shirts, R.drawable.street_t_shirt,
        R.drawable.street_denim_jacket, R.drawable.street_jacket, R.drawable.street_anorak,
        R.drawable.street_wide_denim, R.drawable.street_cago, R.drawable.street_trainning
    )
    var txt_AAC17 = arrayOf(
        "후드티", "셔츠", "긴팔티",
        "데님 자켓", "블루종/Ma-1", "아노락",
        "청바지", "카고 팬츠", "트레이닝바지"
    )
    var AAC20 = intArrayOf(
        R.drawable.street_short_tshirts, R.drawable.street_shirts, R.drawable.street_t_shirt,
        R.drawable.street_windbreaker, R.drawable.street_jacket, R.drawable.street_anorak,
        R.drawable.street_wide_denim, R.drawable.street_cago, R.drawable.street_trainning
    )
    var txt_AAC20 = arrayOf(
        "반팔티", "셔츠", "긴팔티",
        "바람막이", "블루종/Ma-1", "아노락",
        "얇은 청바지", "얇은 카고 팬츠", "얇은 트레이닝바지"
    )
    var AAC23 = intArrayOf(
        R.drawable.street_short_tshirts, R.drawable.street_short_shirts, R.drawable.street_nasi,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.street_shortpants, R.drawable.street_cago, R.drawable.street_trainning
    )
    var txt_AAC23 = arrayOf(
        "반팔티", "반팔 셔츠", "민소매",
        "", "", "",
        "반바지", "얇은 카고 팬츠", "얇은 트레이닝바지"
    )
    var AAC28 = intArrayOf(
        R.drawable.street_short_tshirts, R.drawable.street_short_shirts, R.drawable.street_nasi,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.street_shortpants, R.drawable.street_cago, R.drawable.street_mun_pants
    )
    var txt_AAC28 = arrayOf(
        "반팔티", "반팔 셔츠", "민소매",
        "", "", "",
        "반바지", "얇은 카고 팬츠", "얇은 면바지"
    )

    // 남 더위적게탐 스트릿
    var ABC4 = intArrayOf(
        R.drawable.street_warm_hood, R.drawable.street_warm_knet, R.drawable.street_warm_neck,
        R.drawable.street_short_padding, R.drawable.street_mustang, R.drawable.street_baseball,
        R.drawable.street_jogger, R.drawable.street_cago, R.drawable.street_sweat_pants
    )
    var txt_ABC4 = arrayOf(
        "기모 후드티", "니트", "목폴람티",
        "숏패딩", "무스탕", "바시티 자켓",
        "기모 조거 팬츠", "기모 카고 팬츠", "기모 스웻 팬츠"
    )
    var ABC5 = intArrayOf(
        R.drawable.street_warm_hood, R.drawable.street_warm_knet, R.drawable.street_warm_neck,
        R.drawable.street_short_padding, R.drawable.street_mustang, R.drawable.street_baseball,
        R.drawable.street_jogger, R.drawable.street_cago, R.drawable.street_sweat_pants
    )
    var txt_ABC5 = arrayOf(
        "기모 후드티", "니트", "목폴람티",
        "숏패딩", "무스탕", "바시티 자켓",
        "기모 조거 팬츠", "기모 카고 팬츠", "기모 스웻 팬츠"
    )
    var ABC9 = intArrayOf(
        R.drawable.street_warm_hood, R.drawable.street_warm_knet, R.drawable.street_t_shirt,
        R.drawable.street_denim_jacket, R.drawable.street_jacket, R.drawable.street_anorak,
        R.drawable.street_jogger, R.drawable.street_cago, R.drawable.street_trainning
    )
    var txt_ABC9 = arrayOf(
        "기모 후드티", "니트", "긴팔티",
        "데님 자켓", "블루종/Ma-1", "아노락",
        "두꺼운 조거 팬츠", "두꺼운 카고 팬츠", "두꺼운 트레이닝바지"
    )
    var ABC12 = intArrayOf(
        R.drawable.street_hood, R.drawable.street_warm_knet, R.drawable.street_t_shirt,
        R.drawable.street_denim_jacket, R.drawable.street_jacket, R.drawable.street_anorak,
        R.drawable.street_wide_denim, R.drawable.street_cago, R.drawable.street_trainning
    )
    var txt_ABC12 = arrayOf(
        "후드티", "니트", "긴팔티",
        "데님 자켓", "블루종/Ma-1", "아노락",
        "청바지", "카고 팬츠", "트레이닝바지"
    )
    var ABC17 = intArrayOf(
        R.drawable.street_hood, R.drawable.street_shirts, R.drawable.street_t_shirt,
        R.drawable.street_denim_jacket, R.drawable.street_jacket, R.drawable.street_anorak,
        R.drawable.street_wide_denim, R.drawable.street_cago, R.drawable.street_trainning
    )
    var txt_ABC17 = arrayOf(
        "후드티", "셔츠", "긴팔티",
        "데님 자켓", "블루종/Ma-1", "아노락",
        "청바지", "카고 팬츠", "트레이닝바지"
    )
    var ABC20 = intArrayOf(
        R.drawable.street_short_tshirts, R.drawable.street_shirts, R.drawable.street_t_shirt,
        R.drawable.street_windbreaker, R.drawable.street_jacket, R.drawable.street_anorak,
        R.drawable.street_wide_denim, R.drawable.street_cago, R.drawable.street_trainning
    )
    var txt_ABC20 = arrayOf(
        "반팔티", "셔츠", "긴팔티",
        "바람막이", "블루종/Ma-1", "아노락",
        "청바지", "카고 팬츠", "트레이닝바지"
    )
    var ABC23 = intArrayOf(
        R.drawable.street_short_tshirts, R.drawable.street_short_shirts, R.drawable.street_nasi,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.street_shortpants, R.drawable.street_cago, R.drawable.street_trainning
    )
    var txt_ABC23 = arrayOf(
        "반팔티", "반팔 셔츠", "민소매",
        "", "", "",
        "얇은 반바지", "얇은 카고 팬츠", "얇은 트레이닝바지"
    )
    var ABC28 = intArrayOf(
        R.drawable.street_short_tshirts, R.drawable.street_short_shirts, R.drawable.street_nasi,
        R.drawable.ic_xxx, R.drawable.ic_xxx, R.drawable.ic_xxx,
        R.drawable.street_shortpants, R.drawable.street_cago, R.drawable.street_mun_pants
    )
    var txt_ABC28 = arrayOf(
        "반팔티", "반팔 셔츠", "민소매",
        "", "", "",
        "반바지", "얇은 카고 팬츠", "얇은 면바지"
    )
}