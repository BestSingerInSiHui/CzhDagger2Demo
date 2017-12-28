package com.demo.czh.czhdagger2demo.example.di

import android.app.Activity
import com.demo.czh.czhdagger2demo.example.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by hasee on 2017/12/15.
 */
@Module
class ActivityModule {
    private var activity: Activity

    constructor(activity: Activity) {
        this.activity = activity
    }

    @Provides
    @ActivityScope
    fun activity(): Activity {
        return activity
    }
}