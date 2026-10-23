package com.example.managementapp.data

import  androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.update.
import androidx.room.flow.Flow
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao{
    //simpan data tugas baru ke DB
    @insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(task: TaskEntity)

    //menampilkan data
    @Query(value ="SELECT * FROM table_tasks  ORDER BY id Desc")
    fun getAllTask(): Flow<List<TaskEntity

     //update data
    @update
    suspend fun deleteTask(task : TaskEntity)

    //hapus data
    @Delete
    suspend fun deleteTask(task : TaskEntity)
}
class TeksDAO {
}