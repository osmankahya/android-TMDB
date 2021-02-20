package com.okahya.tmdbclient.presentation.di.core

import com.okahya.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.okahya.tmdbclient.presentation.di.movie.MovieSubComponent
import com.okahya.tmdbclient.presentation.di.tvshow.TvShowSubComponent
import dagger.Component
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Component(modules = [
AppModule::class,
NetModule::class,
DataBaseModule::class,
UseCaseModule::class,
RepositoryModule::class,
RemoteDataModule::class,
LocalDataModule::class,
CacheDataModule::class
])
interface AppComponent {
    fun movieSubComponent(): MovieSubComponent.Factory
    fun tvShowSubComponent(): TvShowSubComponent.Factory
    fun artistSubComponent(): ArtistSubComponent.Factory
}