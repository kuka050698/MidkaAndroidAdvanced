package com.example.user.midkaandroidadvanced.Activities

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.user.midkaandroidadvanced.DB.Room.Tasks
import com.example.user.midkaandroidadvanced.DB.Room.TasksDAO
import com.example.user.midkaandroidadvanced.R
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    private lateinit var title_todo: String
    private lateinit var date_todo: String
    private lateinit var content_todo: String
    private var list_News: ArrayList<Tasks> = ArrayList()
    private lateinit var tasksDao: TasksDAO
    private lateinit var list: ArrayList<Tasks>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        insertTodosButton.setOnClickListener{
            Toast.makeText(this,"Added", Toast.LENGTH_SHORT).show()
            title_todo = titleValue.text.toString()
            date_todo = dateValue.text.toString()
            content_todo = contentValue.text.toString()
            Thread(Runnable {
                val news = Tasks(tasksDao.getCount()+1,title_todo, date_todo, content_todo)
                tasksDao.insert(news)
                list_News = tasksDao.getTasks() as ArrayList<Tasks>
                runOnUiThread {
                    setResult(Activity.RESULT_OK)

                    Log.d("log", "tasks" + list_News)
                    finish()
                }
            }).start()

        }
    }
}
