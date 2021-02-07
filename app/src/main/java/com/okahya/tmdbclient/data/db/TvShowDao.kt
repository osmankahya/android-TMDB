package com.okahya.tmdbclient.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.okahya.tmdbclient.data.model.tvshow.TvShow

@Dao
interface TvShowDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTvShows(tvShows: List<TvShow>)

    @Query(value = "DELETE FROM popular_tvshows")
    suspend fun deleteAllTvShows()

    @Query(value = "SELECT * FROM popular_tvshows")
    suspend fun getTvShows(): List<TvShow>
}