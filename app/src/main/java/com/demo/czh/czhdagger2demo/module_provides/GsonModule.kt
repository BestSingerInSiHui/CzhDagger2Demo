package com.demo.czh.czhdagger2demo.module_provides

import com.google.gson.Gson
import dagger.Module
import dagger.Provides

/**
 * Created by hasee on 2017/12/5.
 */
@Module
class GsonModule {
    @Provides
    fun providedGson(): Gson {
        return Gson()
    }
}