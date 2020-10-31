package com.vincent.jetpacktest.adapter

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.BindingAdapter

//报错需要导入
//apply plugin: 'kotlin-kapt'

@BindingAdapter("value1","value2")
fun setAddValue(view: TextView,value1:Int,value2:Int ){
    view.setPadding(200,100,view.paddingRight,view.paddingBottom)
    view.text = ""+(value1+value2)
}
//@BindingAdapter("android:text")
//fun     setText(view: TextView?, text:String) {
//    view?.text = text + "----BindingAdapter";
//}
//requireAll false 允许部分传参
@BindingAdapter(value = ["url","error"],requireAll = false)
fun     loadImage(view: TextView, url:String?,error:String?) {
    view.text = url + "----"+error;
}
