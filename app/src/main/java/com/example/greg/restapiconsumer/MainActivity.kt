package com.example.greg.restapiconsumer

import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.greg.restapiconsumer.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val model: MainViewModel by viewModels()

        model.getDataText().observe(this, Observer {
            //todo: replace ResponseBody with actual data model
            findViewById<TextView>(R.id.dataTextView).text = it.string()
        })
    }
}