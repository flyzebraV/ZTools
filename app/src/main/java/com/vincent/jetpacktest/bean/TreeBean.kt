package com.vincent.jetpacktest.bean

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class TreeBean :BaseObservable(){
//    @get:Bindable
    var stem:String=""
    set(value) {
        field=value
        //BR 报错需要build
//        notifyPropertyChanged(BR.stem)
    }

//    @get:Bindable
//    var firstName:String=""
//        set(value)  {
//            field=value
//            notifyPropertyChanged(BR.stem)
//        }


}