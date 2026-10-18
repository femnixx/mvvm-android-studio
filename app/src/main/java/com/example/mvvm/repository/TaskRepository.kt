package com.example.mvvm.repository

import com.example.mvvm.model.Task

open class TaskRepository {
    open fun loadInitialTasks(): List<Task> = listOf(
        Task(1, "Learn Compose basics"),
        Task(2, "Understand ViewModel"),
        Task(3, "Write a unit test")
    )
}