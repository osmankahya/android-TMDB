package com.okahya.tmdbclient.domain.repository

import com.okahya.tmdbclient.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows(): List<TvShow>?
    suspend fun updateTvShows(): List<TvShow>?
}