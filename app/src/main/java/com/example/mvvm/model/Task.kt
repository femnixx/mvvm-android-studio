package com.example.mvvm.model

data class Task(
    val id: Int,
    val title: String,
    val done: Boolean = false
)