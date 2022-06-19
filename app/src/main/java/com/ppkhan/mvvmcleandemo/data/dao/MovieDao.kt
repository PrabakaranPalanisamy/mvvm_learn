package com.ppkhan.mvvmcleandemo.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ppkhan.mvvmcleandemo.data.model.movie.Movie
import com.ppkhan.mvvmcleandemo.util.GlobalVariables


@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovieList(movieslist: List<Movie>)

    @Query("DELETE FROM ${GlobalVariables.MOVIETABLENAME}")
    suspend fun deleteAllMovies()

    @Query("SELECT * FROM ${GlobalVariables.MOVIETABLENAME}")
    suspend fun getAllMovies(movieslist: LiveData<List<Movie>>)

}