package com.uralsiberianworks.neuralpushkinonkotlin.model.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.uralsiberianworks.neuralpushkinonkotlin.model.local.entity.Message

@Dao
interface MessageDao {
    @Query("SELECT * FROM message WHERE chatID = :chatID")
    fun getAllMessages(chatID: String): List<Message>

    @Insert
    fun insert(message: Message)

    @Delete
    fun delete(message: Message)
}