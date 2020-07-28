package com.example.multiplescreenshare
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplescreenshare.R



class FragmentA: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragment_a, container, false)

        setupRecyclerView(rootView)

        return rootView
    }

    private fun setupRecyclerView(rootView: View) {

        val recyclerView = rootView.findViewById(R.id.recycler_view) as RecyclerView

        val adapter = RecyclerAdapter(context, Items.favourite)
        recyclerView.adapter = adapter

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager
    }
}
