package com.vincent.jetpacktest.livedata

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.math.BigDecimal

class StockLiveData():LiveData<Boolean> (){

    override fun onActive() {
        super.onActive()
        value=true
      Log.d("StockLiveData","onActive")
    }

    override fun onInactive() {
        super.onInactive()
        value=false
        Log.d("StockLiveData","onInactive")
    }
}


