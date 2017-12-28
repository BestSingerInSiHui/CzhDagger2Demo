package com.demo.czh.czhdagger2demo.abstract_module_provides

import javax.inject.Inject

/**
 * Created by hasee on 2017/12/5.
 */
class Beef : Food {
    constructor()

    override fun meat(): String {
        return "牛肉"
    }
}