package com.vincent.jetpacktest.bean

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

/**
 * 描述：
 */
class UserOb {

    var firstName: String = ""
    //可观察字段
    var lastName = ObservableField<String>()
    var age = ObservableInt()
}