package com.uralsiberianworks.neuralpushkinonkotlin.model.local.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.uralsiberianworks.neuralpushkinonkotlin.model.local.dao.ChatDao
import com.uralsiberianworks.neuralpushkinonkotlin.model.local.dao.ContactDao
import com.uralsiberianworks.neuralpushkinonkotlin.model.local.dao.MessageDao
import com.uralsiberianworks.neuralpushkinonkotlin.model.local.entity.Chat
import com.uralsiberianworks.neuralpushkinonkotlin.model.local.entity.Contact
import com.uralsiberianworks.neuralpushkinonkotlin.model.local.entity.Message
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

@Database(
    entities = [Chat::class, Contact::class, Message::class],
    version = 1
)
abstract class AppDataBase : RoomDatabase() {
    abstract fun getChatDao(): ChatDao
    abstract fun getContactDao(): ContactDao
    abstract fun getMessageDao(): MessageDao

}