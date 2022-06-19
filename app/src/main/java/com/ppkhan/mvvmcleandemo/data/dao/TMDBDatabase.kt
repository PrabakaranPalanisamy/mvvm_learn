package com.ppkhan.mvvmcleandemo.data.dao

abstract class TMDBDatabase {
    abstract val movieDao:MovieDao
    abstract val peopleDao:PeopleDao
    abstract val tvshowDao:TvShowDao
}