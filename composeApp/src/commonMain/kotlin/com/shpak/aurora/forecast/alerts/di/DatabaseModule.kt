package com.shpak.aurora.forecast.alerts.di

/*
import android.content.Context
import androidx.room.Room
import com.shpak.aurora.forecast.alerts.data.repository.local.AppDatabase
import com.shpak.aurora.forecast.alerts.data.repository.local.ForecastHistoryDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "geomagnetic_storm_forecast_database"
        ).build()
    }

    @Provides
    fun provideForecastHistoryDao(database: AppDatabase): ForecastHistoryDao {
        return database.forecastHistoryDao()
    }
}
 */