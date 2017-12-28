package com.demo.czh.czhdagger2demo.module_provides

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.demo.czh.czhdagger2demo.R
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_fruits.*
import javax.inject.Inject

/**
 * Created by hasee on 2017/12/5.
 */
class GsonActivity : AppCompatActivity() {
    @Inject
    lateinit var gson: Gson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits)
        DaggerGsonActivityComponent.create().inject(this)
        var str = "{'name':'小明','age':'18'}"
        textview.setText("${gson.fromJson(str, XiaoMing::class.java)}")
    }
}