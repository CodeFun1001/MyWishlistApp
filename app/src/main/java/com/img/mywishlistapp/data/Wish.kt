package com.img.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,
    @ColumnInfo(name = "wish_title")
    val title : String = "",
    @ColumnInfo(name = "wish_desc")
    val description : String = ""
)

object DummyList{
    val wishList = listOf(
        Wish(title = "Become Android Developer", description = "A Kotlin Jetpack Compose Decveloper who will make amazing apps which would solve all kinds of problems"),
        Wish(title = "Start UPSC prep ASAP", description = "at least read all req ncert tb from 6 to 12th for upsc"),
        Wish(title = "Make a wishlist app ", description = "With Room Database enabled"),
        Wish(title = "Able to apply Cloud Database to Apps", description = "Make all useful apps using Firebase"),
        Wish(title = "Complete this course", description = "Make many projects after that when I can able to apply many things like apis, room as well as cloud database"),
        Wish(title = "Update all apps made", description = "Upload them all on Github"),
        Wish(title = "Make many cool projects", description = "Make all projects as wished in last sem and many more with cool features ")
    )
}