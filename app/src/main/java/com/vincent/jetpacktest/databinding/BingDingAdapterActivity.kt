package com.vincent.jetpacktest.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.vincent.jetpacktest.R
import com.vincent.jetpacktest.bean.User

class BingDingAdapterActivity :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityBindAdapterBinding>(
            this,
            R.layout.activity_bind_adapter
        )
        binding.user= User("xiao","ming",19)
    }
}