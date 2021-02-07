package com.okahya.tmdbclient.data.repository.artist.datasourceImpl

import com.okahya.tmdbclient.data.model.artist.Artist
import com.okahya.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource

class ArtistCacheDataSourceImpl:
    ArtistCacheDataSource {
    private var artistList = ArrayList<Artist>()

    override suspend fun getArtistsFromCache(): List<Artist> {
        return artistList
    }

    override suspend fun saveArtistsToCache(artist: List<Artist>) {
        artistList.clear()
        artistList = ArrayList(artist)
    }
}