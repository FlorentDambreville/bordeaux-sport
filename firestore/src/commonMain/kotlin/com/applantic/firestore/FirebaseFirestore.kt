package com.applantic.firestore

expect class FirebaseFirestore

expect fun FirebaseFirestore.collection(collectionPath: String): CollectionReference
expect fun FirebaseFirestore.collectionGroup(collectionId: String): Query
expect fun FirebaseFirestore.document(documentPath: String): DocumentReference

expect var FirebaseFirestore.settings: FirebaseFirestoreSettings

expect fun getFirebaseInstance(): FirebaseFirestore