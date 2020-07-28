package com.example.multiplescreenshare

import android.os.Bundle
//import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_b.*


class FragmentB : Fragment() {

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

		return inflater.inflate(R.layout.fragment_b, container, false)
	}

	fun displayDetails(name: String) {

        txvTitle.text = "The favourite activity of shubham "+name
	}
}
