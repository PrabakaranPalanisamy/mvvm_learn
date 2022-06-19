package com.ppkhan.mvvmcleandemo.data.api

import com.ppkhan.mvvmcleandemo.data.model.movie.PopMovieList
import com.ppkhan.mvvmcleandemo.data.model.people.PopPeopleList
import com.ppkhan.mvvmcleandemo.data.model.tvshow.PopTvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopMovieList(@Query("api_key") apikey: String): Response<PopMovieList>
    @GET("tv/popular")
    suspend fun getPopTvList(@Query("api_key") apikey: String): Response<PopTvShowList>
    @GET("person/popular")
    suspend fun getPopPeopleList(@Query("api_key") apikey: String): Response<PopPeopleList>
}