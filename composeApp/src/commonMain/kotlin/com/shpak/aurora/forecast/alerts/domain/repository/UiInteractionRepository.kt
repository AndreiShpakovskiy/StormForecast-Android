package com.shpak.aurora.forecast.alerts.domain.repository

interface UiInteractionRepository {
    suspend fun isPreNotificationPermissionDialogShown(): Boolean
    suspend fun setPreNotificationPermissionDialogShown()
}