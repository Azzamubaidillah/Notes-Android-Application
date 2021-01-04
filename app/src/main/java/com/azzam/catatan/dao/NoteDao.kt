package com.azzam.catatan.dao

import androidx.room.*
import com.azzam.catatan.entities.Notes

@Dao
interface NoteDao {
    @get:Query("SELECT * FROM notes ORDER BY id DESC")
    val allNotes: List<Notes>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNotes (note:Notes)

    @Delete
    suspend fun deleteNotes (note:Notes)

}