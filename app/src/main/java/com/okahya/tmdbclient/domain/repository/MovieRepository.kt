package com.okahya.tmdbclient.domain.repository

import com.okahya.tmdbclient.data.model.movie.Movie

interface MovieRepository {
    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}