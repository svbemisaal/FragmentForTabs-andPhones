package com.example.multiplescreenshare

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.multiplescreenshare.R
//import com.smartherd.multiplescreensupport.DetailActivity
//import com.smartherd.multiplescreensupport.MyCommunicator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MyCommunicator {

	private var tab = false

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)


        val fragmentBView = findViewById<View>(R.id.fragmentB)
        tab = fragmentBView?.visibility == View.VISIBLE
	}

	    override fun displayDetails(name: String) {

        if (tab) {
            val fragmentB = supportFragmentManager.findFragmentById(R.id.fragmentB) as FragmentB?
            fragmentB?.displayDetails(name)
        } else {


            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("title","The favourite activity is "+name )

            startActivity(intent)
        }
	}
}
