package com.okahya.tmdbclient.presentation.di.tvshow

import com.okahya.tmdbclient.domain.usecase.GetArtistsUseCase
import com.okahya.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.okahya.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.okahya.tmdbclient.domain.usecase.UpdateTvShowsUseCase
import com.okahya.tmdbclient.presentation.artist.ArtistViewModelFactory
import com.okahya.tmdbclient.presentation.tv.TvShowViewModel
import com.okahya.tmdbclient.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {

    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase):
            TvShowViewModelFactory {
        return TvShowViewModelFactory(getTvShowsUseCase, updateTvShowsUseCase)
    }
}