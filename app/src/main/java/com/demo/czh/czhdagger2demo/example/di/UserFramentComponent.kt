package com.demo.czh.czhdagger2demo.example.di

import com.demo.czh.czhdagger2demo.example.view.UserFragment
import dagger.Subcomponent

/**
 * Created by hasee on 2017/12/19.
 */
@Subcomponent
interface UserFramentComponent {
    fun inject(userFragment: UserFragment)
}