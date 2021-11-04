package com.uralsiberianworks.neuralpushkinonkotlin.model.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [ForeignKey(
        entity = Chat::class,
        parentColumns = ["chatID"],
        childColumns = ["chatID"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class Message (
    @PrimaryKey
    var messageID: String,
    var text: String,
    var chatID: String,
    var type: String,
    var initialLength: Int = 0 // не нравится мне это
)