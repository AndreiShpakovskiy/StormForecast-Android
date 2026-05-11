package com.shpak.aurora.forecast.alerts.data.network

interface TextDataSource {
    suspend fun loadRawData(): String
}