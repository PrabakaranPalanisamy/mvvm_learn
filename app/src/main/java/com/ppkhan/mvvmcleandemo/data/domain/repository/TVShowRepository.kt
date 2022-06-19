package com.ppkhan.mvvmcleandemo.data.domain.repository

import com.ppkhan.mvvmcleandemo.data.model.movie.Movie
import com.ppkhan.mvvmcleandemo.data.model.tvshow.TvShow

interface TVShowRepository {
    suspend fun getTvShows():List<TvShow>
    suspend fun updateTvShows():List<TvShow>
}