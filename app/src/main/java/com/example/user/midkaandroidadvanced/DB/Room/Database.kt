package com.example.user.midkaandroidadvanced.DB.Room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
@Database(entities = [(Tasks::class)],version = 3,exportSchema = false)
abstract class Database:RoomDatabase(){
    abstract fun tasksDAO():TasksDAO
}