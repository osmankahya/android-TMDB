package com.okahya.tmdbclient.data.repository.artist.datasource

import com.okahya.tmdbclient.data.model.artist.Artist

interface ArtistLocalDataSource {
    suspend fun getArtistsFromDB(): List<Artist>
    suspend fun saveArtistsToDB(artist: List<Artist>)
    suspend fun clearAll()
}