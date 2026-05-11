package com.shpak.aurora.forecast.alerts.domain.repository

import com.shpak.aurora.forecast.alerts.domain.model.GeomagneticForecast
import com.shpak.aurora.forecast.alerts.domain.util.Resource

interface GeomagneticForecastRepository {
    suspend fun getGeomagneticForecast(): Resource<GeomagneticForecast>
}