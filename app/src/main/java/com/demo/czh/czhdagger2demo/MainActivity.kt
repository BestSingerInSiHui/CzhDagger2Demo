package com.demo.czh.czhdagger2demo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.demo.czh.czhdagger2demo.abstract_module_provides.FoodActivity
import com.demo.czh.czhdagger2demo.component_dependencies.DependenciesActivity
import com.demo.czh.czhdagger2demo.example.view.UserActivity
import com.demo.czh.czhdagger2demo.inject_component.FruitsActivity
import com.demo.czh.czhdagger2demo.module_provides.GsonActivity
import com.demo.czh.czhdagger2demo.named.PetsActivity
import com.demo.czh.czhdagger2demo.qualifier.ColorActivity
import com.demo.czh.czhdagger2demo.singleton.SingletonActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inject_component.setOnClickListener(this)
        module_provides.setOnClickListener(this)
        abstract_module_provides.setOnClickListener(this)
        named.setOnClickListener(this)
        qualifier.setOnClickListener(this)
        singleton.setOnClickListener(this)
        dependencies.setOnClickListener(this)
        example.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.inject_component -> startActivity(Intent(this, FruitsActivity::class.java))
            R.id.module_provides -> startActivity(Intent(this, GsonActivity::class.java))
            R.id.abstract_module_provides -> startActivity(Intent(this, FoodActivity::class.java))
            R.id.named -> startActivity(Intent(this, PetsActivity::class.java))
            R.id.qualifier -> startActivity(Intent(this, ColorActivity::class.java))
            R.id.singleton -> startActivity(Intent(this, SingletonActivity::class.java))
            R.id.dependencies -> startActivity(Intent(this, DependenciesActivity::class.java))
            R.id.example -> startActivity(Intent(this, UserActivity::class.java))
        }
    }
}
