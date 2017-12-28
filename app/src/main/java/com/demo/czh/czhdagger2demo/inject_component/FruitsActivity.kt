package com.demo.czh.czhdagger2demo.inject_component

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.demo.czh.czhdagger2demo.R
import kotlinx.android.synthetic.main.activity_fruits.*
import javax.inject.Inject

/**
 * Created by hasee on 2017/12/5.
 */
class FruitsActivity : AppCompatActivity() {
    @Inject
    lateinit var fruits: Fruits

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits)
        DaggerFruitsActivityComponent.create().inject(this)
        textview.setText(fruits.banana)
    }
}
