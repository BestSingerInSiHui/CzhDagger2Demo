package com.demo.czh.czhdagger2demo.example.app

import android.app.Application

/**
 * Created by hasee on 2017/12/18.
 */
class App : Application() {
    init {
        instance = this
    }

    companion object {
        lateinit var instance: App
    }

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    fun getAppComponent(): AppComponent {
        return appComponent
    }
}