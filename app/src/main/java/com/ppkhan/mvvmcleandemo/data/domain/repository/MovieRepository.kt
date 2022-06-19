package com.ppkhan.mvvmcleandemo.data.domain.repository

import com.ppkhan.mvvmcleandemo.data.model.movie.Movie

interface MovieRepository {
    suspend fun getMovies():List<Movie>
    suspend fun updateMovies():List<Movie>
}