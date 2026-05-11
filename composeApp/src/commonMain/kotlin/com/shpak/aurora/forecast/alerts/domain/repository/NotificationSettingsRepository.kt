package com.shpak.aurora.forecast.alerts.domain.repository

interface NotificationSettingsRepository {

    suspend fun areNotificationsEnabled(): Boolean

    suspend fun setNotificationsEnabled(areEnabled: Boolean)

    suspend fun isDailyForecastEnabled(): Boolean

    suspend fun setDailyForecastEnabled(isEnabled: Boolean)
}