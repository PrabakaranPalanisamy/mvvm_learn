package com.ppkhan.mvvmcleandemo.data.model.people


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.ppkhan.mvvmcleandemo.util.GlobalVariables

@Entity(tableName = GlobalVariables.PEOPLETABLENAME)
data class People(
    @PrimaryKey
    @SerializedName("gender")
    val gender: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("popularity")
    val popularity: Double,
    @SerializedName("profile_path")
    val profilePath: String
)