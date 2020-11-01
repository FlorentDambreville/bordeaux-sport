package com.applantic.bordeauxsport.entity

data class Spot(
    val id: String,
    val name: String,
    val fieldType: FieldType,
    val coordinate: Coordinates
) {

    enum class FieldType {
        BASKET
    }

    data class Coordinates(
        val latitude: Long,
        val longitude: Long
    )
}