package com.example.cameraassignment.model

data class Item(
    val id: String,
    val name: String,
    val request: Request,
    val response: List<Any>
)