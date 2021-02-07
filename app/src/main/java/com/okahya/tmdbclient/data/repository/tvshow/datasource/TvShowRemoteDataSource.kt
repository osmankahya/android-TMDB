package com.okahya.tmdbclient.data.repository.tvshow.datasource

import com.okahya.tmdbclient.data.model.movie.MovieList
import com.okahya.tmdbclient.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {
    suspend fun getTvShows(): Response<TvShowList>
}