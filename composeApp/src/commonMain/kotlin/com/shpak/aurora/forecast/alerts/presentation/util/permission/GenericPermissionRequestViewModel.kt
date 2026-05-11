package com.shpak.aurora.forecast.alerts.presentation.util.permission

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class GenericPermissionRequestViewModel constructor(
    // Event logger
) : ViewModel() {

    var state by mutableStateOf(PermissionRequestState.UNSPECIFIED)
        private set

    private var isPermissionRequested = false

    fun onGranted() {
        state = PermissionRequestState.GRANTED
    }

    fun onShouldShowRationale() {
        state = PermissionRequestState.SHOW_RATIONALE
    }

    fun onPermanentlyDeniedOrNotRequested() {
        state = if (isPermissionRequested)
            PermissionRequestState.PERMANENTLY_DENIED else PermissionRequestState.NOT_REQUESTED
    }

    fun onRequest() {
        isPermissionRequested = true
    }
}