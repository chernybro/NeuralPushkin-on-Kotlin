package com.uralsiberianworks.neuralpushkinonkotlin.model.repository

import com.uralsiberianworks.neuralpushkinonkotlin.model.local.roomdb.AppDataBase


class ContactRepository(private val appDataBase: AppDataBase) {
    // TODO: read more about suspend word use!
    suspend fun getContact(id: String) = appDataBase.getContactDao().getContact(id)
}