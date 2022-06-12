package com.bts18.neighbours.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.bts18.neighbours.R
import com.bts18.neighbours.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        binding.apply {
            onItemClick = View.OnClickListener {
                when(it.id) {
                    R.id.login_button -> {
                        val intent = Intent(this@MainActivity, LoginActivity::class.java)
                        startActivity(intent)
                    }
                    R.id.sign_up_button -> {
                        val intent = Intent(this@MainActivity, RegisterActivity::class.java)
                        startActivity(intent)
                    }
                }
            }
        }
    }
}