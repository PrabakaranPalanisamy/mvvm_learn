package com.ppkhan.mvvmcleandemo.data.domain.usecases

import com.ppkhan.mvvmcleandemo.data.model.movie.Movie
import com.ppkhan.mvvmcleandemo.data.domain.repository.MovieRepository
import com.ppkhan.mvvmcleandemo.data.domain.repository.TVShowRepository
import com.ppkhan.mvvmcleandemo.data.model.tvshow.TvShow

class GetTvshowUseCase(private val tvShowRepository: TVShowRepository){
    suspend fun execute():List<TvShow>? = tvShowRepository.getTvShows()
}