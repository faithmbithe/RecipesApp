package com.faith.recipeapp.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Recipes")
data class Recipes(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(name = "dishName")
    var dishName: String
) : Serializable

