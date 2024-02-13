package com.example.composetutorial.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {

    @Query("SELECT * FROM user_table")
    fun readAllData(): LiveData<List<User>>

    @Insert
    fun insert(onConflict: Int = OnConflictStrategy.IGNORE)
    suspend fun addUser(user: User)

}