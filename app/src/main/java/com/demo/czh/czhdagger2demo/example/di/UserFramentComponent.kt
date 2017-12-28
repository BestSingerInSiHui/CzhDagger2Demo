package com.demo.czh.czhdagger2demo.example.di

import com.demo.czh.czhdagger2demo.example.di.scope.ActivityScope
import com.demo.czh.czhdagger2demo.example.di.scope.FragmentScope
import com.demo.czh.czhdagger2demo.example.view.UserFragment
import dagger.Subcomponent

/**
 * Created by hasee on 2017/12/19.
 */
@FragmentScope
@Subcomponent
interface UserFramentComponent {
    fun inject(userFragment: UserFragment)
}