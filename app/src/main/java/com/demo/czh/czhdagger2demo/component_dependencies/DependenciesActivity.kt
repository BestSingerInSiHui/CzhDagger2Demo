package com.demo.czh.czhdagger2demo.component_dependencies

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.demo.czh.czhdagger2demo.R
import kotlinx.android.synthetic.main.activity_fruits.*
import javax.inject.Inject

/**
 * Created by hasee on 2017/12/20.
 */
class DependenciesActivity : AppCompatActivity() {
    @Inject
    lateinit var fruits: String

    private lateinit var fruitComponent: FruitComponent
    private lateinit var dependenciesComponent: DependenciesComponent
    private lateinit var fruitSubComponent: FruitSubComponent
    private lateinit var fruitExtend: FruitExtendComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits)
        fruitComponent = DaggerFruitComponent.builder().fruitModule(FruitModule()).build()

        //依赖方式
//        dependenciesComponent = DaggerDependenciesComponent.builder().fruitComponent(fruitComponent).build()
//        dependenciesComponent.inject(this)

        //子组件方式
//        fruitSubComponent = fruitComponent.fruitSubComponent()
//        fruitSubComponent.inject(this)

        //继承方式
        fruitExtend = DaggerFruitExtendComponent.builder().fruitModule(FruitModule()).build()
        fruitExtend.inject(this)

        textview.setText(fruits)
    }
}