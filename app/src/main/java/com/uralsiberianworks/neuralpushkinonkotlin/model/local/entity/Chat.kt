package com.uralsiberianworks.neuralpushkinonkotlin.model.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [ForeignKey(
        entity = Contact::class,
        parentColumns = ["contactID"],
        childColumns = ["chatID"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class Chat (
    @PrimaryKey
    var chatID: String,
    var sender: String,
    var lastMessage: String,
    var imagePath: String
)