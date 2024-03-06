package com.example.assginment.models

data class QuickGrabItem(
    val name: String,
    val price: String,
    val rating: String,
    val reviews: String,
    val content: String,
    val isVeg: Boolean,
    val image: Int,
    var isLeft: Boolean?= false,
    var isRight: Boolean?= false,
    var isUp: Boolean?= false,
    var isDown: Boolean?= false
)
