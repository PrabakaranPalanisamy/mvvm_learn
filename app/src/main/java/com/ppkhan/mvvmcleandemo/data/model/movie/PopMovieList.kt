package com.ppkhan.mvvmcleandemo.data.model.movie


import com.google.gson.annotations.SerializedName
import com.ppkhan.mvvmcleandemo.data.model.movie.Movie

data class PopMovieList(
    @SerializedName("results")
    val movies: List<Movie>
)