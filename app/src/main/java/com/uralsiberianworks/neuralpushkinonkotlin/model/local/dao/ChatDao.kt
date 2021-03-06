package com.uralsiberianworks.neuralpushkinonkotlin.model.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.uralsiberianworks.neuralpushkinonkotlin.model.local.entity.Chat

@Dao
interface ChatDao {
    @Query("SELECT * FROM chat WHERE chatID = :id")
    fun  //  WHERE sender = :id
            getChatFromID(id: String?): Chat

    @get:Query("SELECT * FROM chat")
    val allChats: List<Any?>?

    @Query("SELECT CASE WHEN EXISTS ( SELECT * FROM chat WHERE chatID = :id) THEN CAST(1 AS BIT) ELSE CAST(0 AS BIT) END")
    fun checkPushkinExist(id: String?): Boolean

    @Insert
    fun insert(chat: Chat?)

    @Update
    fun update(chat: Chat?)
}