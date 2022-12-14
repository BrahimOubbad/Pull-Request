package com.example.pullRequests

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.pullRequests.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var views: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityMainBinding.inflate(layoutInflater)
        setContentView(views.root)

        views.root.background = ColorDrawable(ContextCompat.getColor(this, R.color.white))

        views.btnAdd.setOnClickListener {
            views.textView.text = ((views.textView.text.toString().toInt().plus(1))).toString()
        }

    }
}