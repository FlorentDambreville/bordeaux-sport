package com.applantic.firestore

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}