package com.shpak.aurora.forecast.alerts.presentation.forecast

import com.shpak.aurora.forecast.alerts.domain.model.GeomagneticForecast

data class StormForecastState(
    val isLoading: Boolean = false,
    val forecast: GeomagneticForecast? = null,
    val isError: Boolean = false,
    val isPreNotificationsPermissionDialogActive: Boolean = false
)