package com.okahya.tmdbclient.data.repository.movie.datasource

import com.okahya.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}