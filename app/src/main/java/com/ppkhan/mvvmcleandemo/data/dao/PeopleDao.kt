package com.ppkhan.mvvmcleandemo.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ppkhan.mvvmcleandemo.data.model.movie.Movie
import com.ppkhan.mvvmcleandemo.data.model.people.People
import com.ppkhan.mvvmcleandemo.data.model.tvshow.TvShow
import com.ppkhan.mvvmcleandemo.util.GlobalVariables


@Dao
interface PeopleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun savePeopleList(movieslist: List<People>)

    @Query("DELETE FROM ${GlobalVariables.PEOPLETABLENAME}")
    suspend fun deleteAllPeople()

    @Query("SELECT * FROM ${GlobalVariables.PEOPLETABLENAME}")
    suspend fun getAllPeoples(movieslist: LiveData<List<People>>)

}