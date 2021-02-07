package com.okahya.tmdbclient.data.repository.movie.datasourceImpl

import com.okahya.tmdbclient.data.db.MovieDao
import com.okahya.tmdbclient.data.model.movie.Movie
import com.okahya.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieLocalDataSourceImpl(private val moviesDao: MovieDao):
    MovieLocalDataSource {

    override suspend fun getMoviesFromDB(): List<Movie> {
        return moviesDao.getMovies()
    }

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            moviesDao.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            moviesDao.deleteAllMovies()
        }
    }
}