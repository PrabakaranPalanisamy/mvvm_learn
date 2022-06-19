package com.ppkhan.mvvmcleandemo.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ppkhan.mvvmcleandemo.data.model.movie.Movie
import com.ppkhan.mvvmcleandemo.data.model.tvshow.TvShow
import com.ppkhan.mvvmcleandemo.util.GlobalVariables


@Dao
interface TvShowDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTvSHowList(movieslist: List<TvShow>)

    @Query("DELETE FROM ${GlobalVariables.TVSHOWTABLENAME}")
    suspend fun deleteAllTvshows()

    @Query("SELECT * FROM ${GlobalVariables.TVSHOWTABLENAME}")
    suspend fun getAllTvshows(movieslist: LiveData<List<TvShow>>)

}