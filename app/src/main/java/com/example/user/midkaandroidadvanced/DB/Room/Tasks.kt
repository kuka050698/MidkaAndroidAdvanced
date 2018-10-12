package com.example.user.midkaandroidadvanced.DB.Room

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "Task")
data class Tasks(
        @PrimaryKey
        var id:Long,
        var name:String,
        var date:String,
        var content:String
) {
}