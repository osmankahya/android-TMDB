package com.okahya.tmdbclient.presentation.di.artist

import com.okahya.tmdbclient.domain.usecase.GetArtistsUseCase
import com.okahya.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.okahya.tmdbclient.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {

    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(getArtistsUseCase: GetArtistsUseCase,
    updateArtistUseCase: UpdateArtistsUseCase): ArtistViewModelFactory {
        return ArtistViewModelFactory(getArtistsUseCase, updateArtistUseCase)
    }
}