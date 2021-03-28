package com.softsquared.template.kotlin.src.main.required.model


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("jwt")
    val jwt: String = "",
    @SerializedName("userIdx")
    val userIdx: Int = 0
)