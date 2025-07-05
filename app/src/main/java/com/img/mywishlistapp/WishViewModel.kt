package com.img.mywishlistapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.img.mywishlistapp.data.Wish
import com.img.mywishlistapp.data.WishRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class WishViewModel(
    private val wishRepository: WishRepository = Graph.wishRepository
) : ViewModel() {

    var wishTitleState by mutableStateOf("")
    var wishDescriptionState by mutableStateOf("")

    fun onWishTitleChanged(newTitleString : String)
    {
        wishTitleState = newTitleString
    }

    fun onWishDescriptionChanged(newDescriptionString : String)
    {
        wishDescriptionState = newDescriptionString
    }

    lateinit var getAllWishes : Flow<List<Wish>>

    init {
        viewModelScope.launch {
            getAllWishes = wishRepository.getWishes()
        }
    }

    fun addWish(wish : Wish)
    {
        viewModelScope.launch {
            wishRepository.addAWish(wish)
        }
    }

    fun getWishById(id : Long) : Flow<Wish>
    {
        return wishRepository.getAWishById(id)
    }

    fun updateWish(wish : Wish)
    {
        viewModelScope.launch {
            wishRepository.updateAWish(wish)
        }
    }

    fun deleteWish(wish : Wish)
    {
        viewModelScope.launch {
            wishRepository.deleteAWish(wish)
        }
    }
}