package com.kama.presentation.view

import android.content.Intent
import android.os.Bundle
import com.kama.core.base.BaseActivity
import com.kama.presentation.databinding.ActivityMyStyleSurveyBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyStyleSurveyActivity : BaseActivity<ActivityMyStyleSurveyBinding>() {

    override fun getActivityBinding(): ActivityMyStyleSurveyBinding =
        ActivityMyStyleSurveyBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(Intent(this, MainViewActivity::class.java))
    }
}