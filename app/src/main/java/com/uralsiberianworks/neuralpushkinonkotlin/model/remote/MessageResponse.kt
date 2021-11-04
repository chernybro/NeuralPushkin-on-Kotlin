package com.uralsiberianworks.neuralpushkinonkotlin.model.remote

import com.google.gson.annotations.SerializedName

data class MessageResponse (
    @SerializedName("text")
    var text: String
)
