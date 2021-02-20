package com.okahya.tmdbclient.presentation.di.movie

import com.okahya.tmdbclient.domain.usecase.GetArtistsUseCase
import com.okahya.tmdbclient.domain.usecase.GetMoviesUseCase
import com.okahya.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.okahya.tmdbclient.domain.usecase.UpdateMoviesUseCase
import com.okahya.tmdbclient.presentation.artist.ArtistViewModelFactory
import com.okahya.tmdbclient.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideArtistViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase): MovieViewModelFactory {
        return MovieViewModelFactory(getMoviesUseCase, updateMoviesUseCase)
    }
}