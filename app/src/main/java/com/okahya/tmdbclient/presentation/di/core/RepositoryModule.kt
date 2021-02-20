package com.okahya.tmdbclient.presentation.di.core

import com.okahya.tmdbclient.data.repository.artist.ArtistRepositoryImpl
import com.okahya.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.okahya.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.okahya.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.okahya.tmdbclient.data.repository.movie.MovieRepositoryImpl
import com.okahya.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.okahya.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.okahya.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import com.okahya.tmdbclient.data.repository.tvshow.TvShowRepositoryImpl
import com.okahya.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.okahya.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.okahya.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.okahya.tmdbclient.domain.repository.ArtistRepository
import com.okahya.tmdbclient.domain.repository.MovieRepository
import com.okahya.tmdbclient.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
    movieRemoteDataSource: MovieRemoteDataSource,
    movieLocalDataSource: MovieLocalDataSource,
    movieCacheDataSource: MovieCacheDataSource): MovieRepository {
        return MovieRepositoryImpl(movieRemoteDataSource,
            movieLocalDataSource,
            movieCacheDataSource)
    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDataSource: TvShowRemoteDataSource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource): TvShowRepository {
        return TvShowRepositoryImpl(tvShowRemoteDataSource,
            tvShowLocalDataSource,
            tvShowCacheDataSource)
    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDataSource: ArtistRemoteDataSource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {
        return ArtistRepositoryImpl(artistRemoteDataSource,
            artistLocalDataSource,
            artistCacheDataSource)
    }
}