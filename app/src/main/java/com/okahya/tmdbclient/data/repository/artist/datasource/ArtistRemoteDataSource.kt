package com.okahya.tmdbclient.data.repository.artist.datasource

import com.okahya.tmdbclient.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists(): Response<ArtistList>
}