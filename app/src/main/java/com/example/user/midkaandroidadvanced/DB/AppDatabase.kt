package com.example.user.midkaandroidadvanced.DB

import android.app.Application
import android.arch.persistence.room.Room
import com.example.user.midkaandroidadvanced.DB.Room.Database

class AppDatabase:Application(){

    lateinit var database: Database
    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(applicationContext,
                Database::class.java,
                "DB")
                .fallbackToDestructiveMigration()
                .build()
    }
}