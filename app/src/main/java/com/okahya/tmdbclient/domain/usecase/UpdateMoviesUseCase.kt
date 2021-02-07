package com.okahya.tmdbclient.domain.usecase

import com.okahya.tmdbclient.data.model.movie.Movie
import com.okahya.tmdbclient.domain.repository.MovieRepository

class UpdateMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.updateMovies()
}