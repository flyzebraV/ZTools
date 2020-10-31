package com.vincent.jetpacktest.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel :ViewModel(){
     var _username=MutableLiveData<String>()
    val username:LiveData<String>
    get() = _username

}