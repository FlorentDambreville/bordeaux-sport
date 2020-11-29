package com.applantic.firestore

data class FirebaseFirestoreSettings(
    val host:String,
    val sslEnabled: Boolean,
    val persistenceEnabled:Boolean,
    val cacheSizeBytes:Long
)
