package com.vincent.jetpacktest.databinding

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableArrayList
import com.vincent.jetpacktest.R
import com.vincent.jetpacktest.bean.TreeBean
import com.vincent.jetpacktest.bean.UserOb

/**
 * 描述：可观察数据
 */
class ObservableDataActivity : AppCompatActivity() {
    var userOb = UserOb();
   lateinit var oblist:ObservableArrayList<Any>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityObservableDataBinding>(
            this,
            R.layout.activity_observable_data
        )


        userOb.firstName = ("李")
        userOb.lastName.set("大白")

        binding.userOb = userOb

        oblist  = ObservableArrayList<Any>().apply {
            add("apple")
            add(10086)
            add(false)
        }
        binding.listobservable=oblist

        //可观察对象
       var treeBean= TreeBean()
        treeBean.stem="big"
        binding.objectObservable=treeBean

    }

    /**
     * 改变可观察字段
     */
    fun changeObservaField(view: View) {
        userOb.firstName = ("LEE")
        userOb.lastName.set("DA BAI")
    }

    /**
     * 改变可观察集合
     */
    fun changeObservaList(view: View) {
        oblist.clear()
    }
}