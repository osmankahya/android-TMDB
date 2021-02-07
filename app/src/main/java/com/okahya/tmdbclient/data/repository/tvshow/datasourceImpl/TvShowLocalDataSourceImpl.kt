package com.okahya.tmdbclient.data.repository.tvshow.datasourceImpl

import com.okahya.tmdbclient.data.db.TvShowDao
import com.okahya.tmdbclient.data.model.tvshow.TvShow
import com.okahya.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TvShowLocalDataSourceImpl(private val tvShowsDao: TvShowDao):
    TvShowLocalDataSource {

    override suspend fun getTvShowsFromDB(): List<TvShow> {
        return tvShowsDao.getTvShows()
    }

    override suspend fun saveTvShowsToDB(tvShows: List<TvShow>) {
        CoroutineScope(Dispatchers.IO).launch {
            tvShowsDao.saveTvShows(tvShows)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            tvShowsDao.deleteAllTvShows()
        }
    }
}