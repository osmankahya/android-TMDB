package com.okahya.tmdbclient.data.repository.artist.datasourceImpl

import com.okahya.tmdbclient.data.db.ArtistDao
import com.okahya.tmdbclient.data.model.artist.Artist
import com.okahya.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArtistLocalDataSourceImpl(private val artistsDao: ArtistDao):
    ArtistLocalDataSource {

    override suspend fun getArtistsFromDB(): List<Artist> {
        return artistsDao.getArtists()
    }

    override suspend fun saveArtistsToDB(artist: List<Artist>) {
        CoroutineScope(Dispatchers.IO).launch {
            artistsDao.saveArtists(artist)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            artistsDao.deleteAllArtists()
        }
    }
}