package com.ppkhan.mvvmcleandemo.data.domain.usecases

import com.ppkhan.mvvmcleandemo.data.model.movie.Movie
import com.ppkhan.mvvmcleandemo.data.domain.repository.MovieRepository

class GetMovieUseCase(private val movieRepository: MovieRepository){
    suspend fun execute():List<Movie>? = movieRepository.getMovies()
}