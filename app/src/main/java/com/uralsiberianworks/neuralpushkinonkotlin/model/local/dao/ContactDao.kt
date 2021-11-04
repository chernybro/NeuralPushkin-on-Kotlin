package com.uralsiberianworks.neuralpushkinonkotlin.model.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.uralsiberianworks.neuralpushkinonkotlin.model.local.entity.Contact

@Dao
interface ContactDao {
    @get:Query("SELECT * FROM contact")
    val allContacts: List<Contact>

    @Query("SELECT * FROM contact WHERE contactID = :id")
    fun getContact(id: String): Contact

    @Insert
    fun insert(contact: Contact)

    @Update
    fun update(contact: Contact)

    @Query("DELETE FROM contact WHERE contactID = :id")
    fun del(id: String)
}