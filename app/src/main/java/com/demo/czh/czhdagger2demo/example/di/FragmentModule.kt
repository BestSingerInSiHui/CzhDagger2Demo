package com.demo.czh.czhdagger2demo.example.di

import android.app.Fragment
import com.demo.czh.czhdagger2demo.example.di.scope.FragmentScope
import dagger.Module
import dagger.Provides

/**
 * Created by hasee on 2017/12/25.
 */
@Module
class FragmentModule {
    private var fragment: Fragment

    constructor(fragment: Fragment) {
        this.fragment = fragment
    }

    @FragmentScope
    @Provides
    fun getFragment(): Fragment {
        return fragment
    }
}