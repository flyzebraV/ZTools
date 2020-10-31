package com.vincent.jetpacktest.listener

import android.view.View
import android.widget.Toast

/**
 * 描述：
 */
class DbClickHandler {
    fun onClickOk(view: View){
        Toast.makeText( view.context,"DbClickHandler Click", Toast.LENGTH_SHORT).show()
    }
}