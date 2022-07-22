package com.example.cameraassignment.model

data class Request(
    val body: Body,
    val description: String,
    val header: List<Any>,
    val method: String,
    val url: Url
)