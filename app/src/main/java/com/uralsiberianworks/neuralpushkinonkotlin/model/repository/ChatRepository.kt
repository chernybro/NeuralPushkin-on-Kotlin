package com.uralsiberianworks.neuralpushkinonkotlin.model.repository

import com.uralsiberianworks.neuralpushkinonkotlin.model.local.roomdb.AppDataBase

class ChatRepository(private val appDataBase: AppDataBase) {

    suspend fun getChat(id: String) = appDataBase.getChatDao().getChatFromID(id)
    //String id = db.getChatDao().getAllChats().get(position).getChatID();
}