package com.ppkhan.mvvmcleandemo.data.model.tvshow


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.ppkhan.mvvmcleandemo.util.GlobalVariables

@Entity(tableName = GlobalVariables.TVSHOWTABLENAME)
data class TvShow(
    @PrimaryKey
    @SerializedName("backdrop_path")
    val backdropPath: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("poster_path")
    val posterPath: String
)