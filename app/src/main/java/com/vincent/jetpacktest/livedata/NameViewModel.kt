package com.vincent.jetpacktest.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NameViewModel : ViewModel() {

    // 创建 LiveData 对象
    val currentName: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }


}