package com.vincent.jetpacktest.listener

import android.view.View
import android.widget.Toast
import com.vincent.jetpacktest.bean.User

/**
 * 描述：
 */
class MyPresent {
    fun onSaveClick(view: View,user: User?,user2: User?){
       Toast.makeText( view.context,"onSaveClick"+user?.firstName+user2?.lastName,Toast.LENGTH_SHORT).show()
    }
}