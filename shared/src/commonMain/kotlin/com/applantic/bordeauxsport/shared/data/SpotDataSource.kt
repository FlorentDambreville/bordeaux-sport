package com.applantic.bordeauxsport.shared.data

import com.applantic.bordeauxsport.shared.entity.Spot

interface SpotDataSource {

    fun getAllSpot(): List<Spot>
}