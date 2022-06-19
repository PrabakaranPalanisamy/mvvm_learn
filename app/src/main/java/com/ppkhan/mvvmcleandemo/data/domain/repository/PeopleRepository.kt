package com.ppkhan.mvvmcleandemo.data.domain.repository

import com.ppkhan.mvvmcleandemo.data.model.people.People
import com.ppkhan.mvvmcleandemo.data.model.tvshow.TvShow

interface PeopleRepository {
    suspend fun getPeoples():List<People>
    suspend fun updatePeoples():List<People>
}