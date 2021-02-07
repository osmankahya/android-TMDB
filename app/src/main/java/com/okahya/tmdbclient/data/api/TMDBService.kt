package com.okahya.tmdbclient.data.api

import com.okahya.tmdbclient.data.model.artist.ArtistList
import retrofit2.http.Query
import com.okahya.tmdbclient.data.model.movie.MovieList
import com.okahya.tmdbclient.data.model.tvshow.TvShowList
import retrofit2.Response
import retrofit2.http.GET

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key")
        apiKey: String
    ): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShows(
        @Query("api_key")
        apiKey: String
    ): Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularArtists(
        @Query("api_key")
        apiKey: String
    ): Response<ArtistList>
}