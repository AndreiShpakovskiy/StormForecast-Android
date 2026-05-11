package com.shpak.aurora.forecast.alerts

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform