package com.shpak.aurora.forecast.alerts.data.util

/*
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.map
import kotlin.text.get

suspend fun <T> DataStore<Preferences>.get(key: Preferences.Key<T>): T? =
    data.map { it[key] }.firstOrNull()

suspend fun <T> DataStore<Preferences>.get(key: Preferences.Key<T>, defaultValue: T): T =
    data.map { it[key] }.firstOrNull() ?: defaultValue

suspend fun <T> DataStore<Preferences>.set(key: Preferences.Key<T>, value: T) {
    edit { preferences -> preferences[key] = value }
}
 */