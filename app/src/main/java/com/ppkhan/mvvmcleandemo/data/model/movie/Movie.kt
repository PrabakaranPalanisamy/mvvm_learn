package com.ppkhan.mvvmcleandemo.data.model.movie


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.ppkhan.mvvmcleandemo.util.GlobalVariables

@Entity(tableName = GlobalVariables.MOVIETABLENAME)
data class Movie(

    @PrimaryKey
    @SerializedName("id")
    val id: Int,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("video")
    val video: Boolean
)