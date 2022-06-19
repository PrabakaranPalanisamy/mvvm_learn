package com.ppkhan.mvvmcleandemo.data.model.tvshow


import com.google.gson.annotations.SerializedName

data class PopTvShowList(
    @SerializedName("results")
    val tvShows: List<TvShow>
)