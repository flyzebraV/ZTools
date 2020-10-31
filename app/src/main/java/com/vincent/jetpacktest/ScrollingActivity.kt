package com.vincent.jetpacktest

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.android.material.snackbar.Snackbar
import com.vincent.jetpacktest.databinding.ActivityScrollingBinding
import com.vincent.jetpacktest.databinding.BingDingAdapterActivity
import com.vincent.jetpacktest.databinding.DataBindingExpressionsActivity
import com.vincent.jetpacktest.databinding.ObservableDataActivity
import kotlinx.android.synthetic.main.activity_scrolling.*

class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityScrollingBinding>(
            this,
            R.layout.activity_scrolling
        )
        binding.includeLayout.dataBinding.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, DataBindingExpressionsActivity::class.java))
        })
        binding.includeLayout.dataBindingObserva.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, ObservableDataActivity::class.java))
        })
        binding.includeLayout.dataBindingAdapter.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, BingDingAdapterActivity::class.java))
        })

        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
