package com.example.user.midkaandroidadvanced.DB.Room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query

@Dao
interface TasksDAO{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(task:Tasks):Long?

    @Query("select * from task")
    fun getTasks():List<Tasks>

    @Query("select count(id) from task")
    fun getCount():Long
}