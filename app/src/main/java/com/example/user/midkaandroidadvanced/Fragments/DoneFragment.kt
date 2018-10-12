package com.example.user.midkaandroidadvanced.Fragments

import android.content.Context
import android.content.res.Configuration
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.user.midkaandroidadvanced.DB.AppDatabase
import com.example.user.midkaandroidadvanced.DB.Room.Tasks
import com.example.user.midkaandroidadvanced.DB.Room.TasksDAO

import com.example.user.midkaandroidadvanced.R
import kotlinx.android.synthetic.main.fragment_todo.*

class DoneFragment : Fragment() {
    private lateinit var tasksDAO: TasksDAO
    private var list_Tasks: ArrayList<Tasks> = ArrayList()

    companion object {

        internal var doneFragment = DoneFragment()

        fun newInstance(): DoneFragment {
            return doneFragment
        }
    }

    private lateinit var list: ArrayList<Tasks>
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        if (savedInstanceState != null) {
//            Log.d("TAG", "list " + savedInstanceState.getSerializable("key"))
            list = savedInstanceState.getSerializable("key") as ArrayList<Tasks>
        } else {
            createData()
        }
        tasksDAO = (context as AppDatabase).database.tasksDAO()

        createData()
        rv_todo_list!!.adapter = com.example.user.midkaandroidadvanced.Adapters.ListAdapter(list, context!!)
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            rv_todo_list!!.layoutManager = GridLayoutManager(context, 2) as RecyclerView.LayoutManager?
        } else {
            rv_todo_list!!.layoutManager = LinearLayoutManager(context)
        }
        return view
    }

    private fun createData() {
//        Thread(
//                Runnable {
//                    list_Tasks = tasksDAO.getTasks() as ArrayList<Tasks>
//                    Log.d("Main Tag","main"+list_Tasks)
//                    rv_todo_list.adapter?.notifyDataSetChanged()
//                }).start()

    }

    // TODO: Rename method, update argument and hook method into UI event

}
