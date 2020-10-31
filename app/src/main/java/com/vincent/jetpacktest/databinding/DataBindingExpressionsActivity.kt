package com.vincent.jetpacktest.databinding

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableArrayMap
import com.vincent.jetpacktest.R
import com.vincent.jetpacktest.bean.User
import com.vincent.jetpacktest.listener.DbClickHandler
import com.vincent.jetpacktest.listener.MyPresent

/**
 * 描述：布局和绑定表达式
 */
class DataBindingExpressionsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDatabindingExpressionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //ActivityDatabindingExpressionsBinding 自动生成，

        binding = DataBindingUtil.setContentView<ActivityDatabindingExpressionsBinding>(
            this,
            R.layout.activity_databinding_expressions
        )

        // 另外一种获取bingding对象写法 binding = ActivityDatabindingExpressionsBinding.inflate(getLayoutInflater())

        //集合
        var map = ObservableArrayMap<String, Any>().apply {
            put("firstName", "Google")
            put("lastName", "Inc.")
            put("age", 17)
        }
        binding.map = map

        //list
        var list = ObservableArrayList<Any>().apply {
            add("Hello")
            add("world")
            add(100)
        }
        binding.list = list

        //给xml 中 user 变量赋值
        binding.user = User("LI", "XIAOMING",33)

        //事件监听
        binding.myHandler = DbClickHandler()

        //事件监听
        binding.myPresent = MyPresent()

    }

    /**
     * 使用 LayoutInflater 获取视图
     * 注意，使用inflate需要设置setContentView(inflate.root)
     */
    fun getBindByLayoutInflater(view: View) {
//        binding = ActivityDatabindingExpressionsBinding.inflate(getLayoutInflater())
//        setContentView(binding.root)
//        binding.tvInflater.text="  setContentView(inflate.root)"
    }


}