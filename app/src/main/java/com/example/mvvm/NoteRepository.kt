package com.example.mvvm

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

//Repository create -4
class NoteRepository(private val noteDao: NoteDao) {
    val allNotes:LiveData<List<Note>> = noteDao.getAllNotes()

    @WorkerThread
    suspend fun insert(note: Note){
        noteDao.insert(note)
    }
    suspend fun delete(note: Note){
        noteDao.delete(note)
    }
}