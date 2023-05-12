package com.example.amphibians.data

import com.example.amphibians.model.Amphibian
import com.example.amphibians.network.ApiService

interface AmphibiansRepository {
    suspend fun getAmphibians() : List<Amphibian>
}

class DefaultAmphibiansRepository(
    private val apiService: ApiService
) : AmphibiansRepository {

    override suspend fun getAmphibians(): List<Amphibian> {
        return apiService.getAmphibians()
    }
}