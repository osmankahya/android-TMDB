package com.okahya.tmdbclient.data

import com.google.gson.annotations.SerializedName
import com.okahya.tmdbclient.data.Movie

data class MovieList(
    @SerializedName("results")
    val movies: List<Movie>
)