package com.okahya.tmdbclient.data.repository.artist.datasourceImpl

import com.okahya.tmdbclient.data.api.TMDBService
import com.okahya.tmdbclient.data.model.artist.ArtistList
import com.okahya.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String):
    ArtistRemoteDataSource {

    override suspend fun getArtists(): Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}