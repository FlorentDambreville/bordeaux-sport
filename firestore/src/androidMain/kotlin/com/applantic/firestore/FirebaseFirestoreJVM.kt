package com.applantic.firestore

import com.google.firebase.firestore.FirebaseFirestore.getInstance


actual typealias FirebaseFirestore = com.google.firebase.firestore.FirebaseFirestore

actual fun FirebaseFirestore.collection(collectionPath: String): CollectionReference =
    collection(collectionPath)

actual fun FirebaseFirestore.collectionGroup(collectionId: String): Query =
    collectionGroup(collectionId)

actual fun getFirebaseInstance(): FirebaseFirestore = getInstance()

actual var FirebaseFirestore.settings: FirebaseFirestoreSettings
    get() {
        val fset = firestoreSettings
        return FirebaseFirestoreSettings(
            fset.host,
            fset.isSslEnabled,
            fset.isPersistenceEnabled,
            fset.cacheSizeBytes
        )
    }
    set(value) {
        val settingsBuilder = com.google.firebase.firestore.FirebaseFirestoreSettings.Builder()
        settingsBuilder.setHost(value.host)
            .setSslEnabled(value.sslEnabled)
            .setPersistenceEnabled(value.persistenceEnabled)
            .setCacheSizeBytes(value.cacheSizeBytes)
        firestoreSettings = settingsBuilder.build()
    }

actual fun FirebaseFirestore.document(documentPath: String): DocumentReference =
    document(documentPath)
