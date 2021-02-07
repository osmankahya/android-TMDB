package com.okahya.tmdbclient.data.repository.artist.datasource

import com.okahya.tmdbclient.data.model.artist.Artist
import com.okahya.tmdbclient.data.model.movie.Movie

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache(): List<Artist>
    suspend fun saveArtistsToCache(artist: List<Artist>)
}