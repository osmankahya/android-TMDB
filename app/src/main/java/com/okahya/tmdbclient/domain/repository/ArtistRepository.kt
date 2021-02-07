package com.okahya.tmdbclient.domain.repository

import com.okahya.tmdbclient.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists(): List<Artist>?
    suspend fun updateArtists(): List<Artist>?
}