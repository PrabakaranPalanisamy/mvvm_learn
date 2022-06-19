package com.ppkhan.mvvmcleandemo.data.domain.usecases

import com.ppkhan.mvvmcleandemo.data.model.movie.Movie
import com.ppkhan.mvvmcleandemo.data.domain.repository.MovieRepository
import com.ppkhan.mvvmcleandemo.data.domain.repository.PeopleRepository
import com.ppkhan.mvvmcleandemo.data.model.people.People

class GetPeopleUseCase(private val peopleRepository: PeopleRepository){
    suspend fun execute():List<People>? = peopleRepository.getPeoples()
}