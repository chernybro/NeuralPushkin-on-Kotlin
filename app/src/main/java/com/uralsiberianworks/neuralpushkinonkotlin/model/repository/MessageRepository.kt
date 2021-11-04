package com.uralsiberianworks.neuralpushkinonkotlin.model.repository

import com.uralsiberianworks.neuralpushkinonkotlin.model.local.roomdb.AppDataBase

class MessageRepository(private val appDataBase: AppDataBase) {

    suspend fun getMessages(id: String) = appDataBase.getMessageDao().getAllMessages(id)
}