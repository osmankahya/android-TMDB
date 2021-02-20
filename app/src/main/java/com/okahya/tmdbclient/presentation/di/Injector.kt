package com.okahya.tmdbclient.presentation.di

import com.okahya.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.okahya.tmdbclient.presentation.di.movie.MovieSubComponent
import com.okahya.tmdbclient.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}