package com.example.mvvm

import androidx.lifecycle.LiveData
import androidx.room.*


//Dao Interface -2
@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: Note)
    //suspend is a coroutines in kotlin that helps to make process smoother where process lags
    @Delete
    suspend fun delete(note: Note)

    @Query("Select * from notes_table order by id ASC")
    fun getAllNotes():LiveData<List<Note>>
}