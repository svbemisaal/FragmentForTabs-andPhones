package com.example.multiplescreenshare

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.multiplescreenshare.R

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val bundle: Bundle?=intent.extras


        val name = bundle!!.getString("title")


        val fragmentB = supportFragmentManager.findFragmentById(R.id.fragmentB) as FragmentB?
        if (name != null) {
            fragmentB?.displayDetails(name)
        }
    }
}
