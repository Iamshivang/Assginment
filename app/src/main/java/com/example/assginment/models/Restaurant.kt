package com.example.assginment.models

data class Restaurant(
    val name: String,
    val rating: String,
    val time: String,
    val distance: String,
    val startsFrom: String,
    val menuList: List<MenuItem>
)
