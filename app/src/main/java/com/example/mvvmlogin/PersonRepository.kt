package com.example.mvvmlogin

class PersonRepository {
    fun login(name: String): Boolean {
        return name != ""
    }
}