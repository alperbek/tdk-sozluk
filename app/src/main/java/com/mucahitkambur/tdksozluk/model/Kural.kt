package com.mucahitkambur.tdksozluk.model

import com.google.gson.annotations.SerializedName

data class Kural(
    @field:SerializedName("adi")
    val adi: String,
    @field:SerializedName("url")
    val url: String
)