package com.example.user.midkaandroidadvanced.Adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.user.midkaandroidadvanced.Activities.DetailsActivity
import com.example.user.midkaandroidadvanced.DB.Room.Tasks
import com.example.user.midkaandroidadvanced.R
import kotlinx.android.synthetic.main.list_item.view.*

class ListAdapter(private val list:ArrayList<Tasks>,private val context: Context):RecyclerView.Adapter<ListAdapter.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item,p0,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.itemView.title.text = list[p1].name
        p0.itemView.date.text = list[p1].date
        p0.itemView.content.text = list[p1].content
//        p0.itemView.setOnClickListener {
//            val intent = Intent(context, DetailsActivity::class.java)
//            intent.putExtra("news", list[p1])
//            context.startActivity(intent)
//        }
    }


    inner class ViewHolder(val view:View): RecyclerView.ViewHolder(view)
}