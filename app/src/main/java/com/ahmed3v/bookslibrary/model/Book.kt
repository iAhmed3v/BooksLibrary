package com.ahmed3v.bookslibrary.model

import androidx.annotation.DrawableRes

/**
 * A data class to represent the information presented in the Book card
 */
data class Book(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val author: String,
    val rating: String
)