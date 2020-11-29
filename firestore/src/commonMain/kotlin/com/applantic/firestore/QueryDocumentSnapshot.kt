package com.applantic.firestore

expect class QueryDocumentSnapshot:DocumentSnapshot

expect fun QueryDocumentSnapshot.data_(serverTimestampBehavior:DocumentSnapshotServerTimestampBehavior? = null):Map<String, Any?>?