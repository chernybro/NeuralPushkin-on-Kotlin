package com.uralsiberianworks.neuralpushkinonkotlin.model.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Contact (
    @PrimaryKey
    var contactID: String,
    var name: String,
    var imagePath: String
)