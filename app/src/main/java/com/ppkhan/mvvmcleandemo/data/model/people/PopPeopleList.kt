package com.ppkhan.mvvmcleandemo.data.model.people


import com.google.gson.annotations.SerializedName
import com.ppkhan.mvvmcleandemo.data.model.people.People

data class PopPeopleList(
    @SerializedName("results")
    val people: List<People>
)