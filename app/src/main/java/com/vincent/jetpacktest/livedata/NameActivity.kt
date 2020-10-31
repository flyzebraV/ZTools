package com.vincent.jetpacktest.livedata

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModelProvider
import com.vincent.jetpacktest.R
import com.vincent.jetpacktest.databinding.ActivityNameBinding
import com.vincent.jetpacktest.databinding.ObservableDataActivity
import com.vincent.jetpacktest.generated.callback.OnClickListener
import com.vincent.jetpacktest.viewModel.UserViewModel

class NameActivity : AppCompatActivity() {

    private lateinit var model: NameViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var bind: ActivityNameBinding = DataBindingUtil.setContentView(this, R.layout.activity_name)


        model =
            ViewModelProvider.AndroidViewModelFactory(application).create(NameViewModel::class.java)

        bind.etName.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //更新 LiveData 对象
                model.currentName.value=p0.toString()
            }

        })

        // 创建观察者并更新UI
        val nameObserver = Observer<String> { newName ->
            bind.tvName.text = newName
        }

        // 观察 LiveData 对象, 传递LifecycleOwner和观察者
        model.currentName.observe(this, nameObserver)


        val stockLiveData = StockLiveData( )

        stockLiveData.observe(this, Observer {
            if (it){
                bind.tvOk.text="活跃"
            }

        })
        val t_name:LiveData<String> =  Transformations.map(model.currentName){
                name->"**\n**"+name+"***\n**"

        }
        t_name.observe(this, Observer {
            bind.tvNo.text=it
        })
//        val t_name:LiveData<String>()=Trans
        val userViewmodel = ViewModelProvider.AndroidViewModelFactory.getInstance(application)
            .create(UserViewModel::class.java)
        bind.usermodel=userViewmodel
        bind.lifecycleOwner=this

        bind.btnUpdateVn.setOnClickListener {
            userViewmodel._username.value="hello"
        }
    }




}
