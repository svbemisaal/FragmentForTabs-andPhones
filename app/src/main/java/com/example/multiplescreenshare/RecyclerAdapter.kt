package com.example.multiplescreenshare

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplescreenshare.R
import kotlinx.android.synthetic.main.list_item.view.*

class RecyclerAdapter(private val context: Context?, private var list: List<Favourite>) :
    RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = inflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val current = list[position]
        holder.setData(current, position)
        holder.setListeners()
    }

    override fun getItemCount(): Int = list.size

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

          var pos: Int = 0
         var current: Favourite?=null

        init {
            itemView.button2.setOnClickListener{


                val intent = Intent(context, DetailActivity::class.java)
                intent.putExtra("title","The favourite activity is "+current!!.name )

                if (context != null) {
                    context.startActivity(intent)
                }
            }
        }



        fun setData(current: Favourite, position: Int) {
            itemView.tvTitle.text = current.name;

            this.pos = position
            this.current = current
        }

        fun setListeners() {

            itemView.setOnClickListener {
                val myCommunicator = context as MyCommunicator
                myCommunicator.displayDetails(current!!.name)
            }
        }
    }
}
