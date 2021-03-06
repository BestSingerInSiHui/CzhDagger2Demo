package com.demo.czh.czhdagger2demo.singleton

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.demo.czh.czhdagger2demo.R
import com.demo.czh.czhdagger2demo.inject_component.Fruits
import com.demo.czh.czhdagger2demo.singleton.Singleton2Activity
import kotlinx.android.synthetic.main.activity_fruits.*
import javax.inject.Inject

/**
 * Created by hasee on 2017/12/6.
 */
class SingletonActivity : AppCompatActivity() {
    @Inject
    lateinit var fruits: Fruits
    @Inject
    lateinit var fruits2: Fruits

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits)
        DaggerSingletonActicityComponent.create().inject(this)
        Log.i("fruits", "${fruits.hashCode()}")
        Log.i("fruits", "${fruits2.hashCode()}")
        textview.setText("${fruits.hashCode()}\n${fruits2.hashCode()}\n点击跳转到Singleton2Activity")
        textview.setOnClickListener {
            startActivity(Intent(this, Singleton2Activity::class.java))
        }
    }
}