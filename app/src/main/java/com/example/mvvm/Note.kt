package com.example.mvvm

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//Entity class -1
@Entity(tableName = "notes_table")
class Note(@ColumnInfo(name = "text")val text:String) {
    @PrimaryKey(autoGenerate = true)var id=0

}