package com.applantic.bordeauxsport.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Spot(
    @SerialName("spot_id")
    val id: String,
    @SerialName("spot_name")
    val name: String,
    @SerialName("field_type")
    val fieldType: FieldType,
    @SerialName("coordinates")
    val coordinate: Coordinates
) {

    enum class FieldType {
        BASKET
    }

    @Serializable
    data class Coordinates(
        @SerialName("latitude")
        val latitude: Long,
        @SerialName("longitude")
        val longitude: Long
    )
}