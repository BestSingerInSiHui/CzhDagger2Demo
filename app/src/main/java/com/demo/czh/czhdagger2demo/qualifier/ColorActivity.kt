package com.demo.czh.czhdagger2demo.qualifier

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.demo.czh.czhdagger2demo.R
import kotlinx.android.synthetic.main.activity_fruits.*
import javax.inject.Inject

/**
 * Created by hasee on 2017/12/6.
 */
class ColorActivity : AppCompatActivity() {
    @Inject
    lateinit var color: Color

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits)
        DaggerColorActivityComponent.create().inject(this)
        textview.setTextColor(color.getColor())
    }
}