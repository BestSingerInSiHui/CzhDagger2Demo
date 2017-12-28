package com.demo.czh.czhdagger2demo

import android.content.Context
import android.widget.Toast

/**
 * Created by hasee on 2017/12/18.
 */
class ToastUtil {
    private var context: Context

    constructor(context: Context) {
        this.context = context
    }

    fun showToast(string: String) {
        Toast.makeText(context, string, Toast.LENGTH_SHORT).show()
    }
}