package com.ahmed3v.bookslibrary.data

import com.ahmed3v.bookslibrary.R
import com.ahmed3v.bookslibrary.model.Book

/**
 * An object to generate a static list of dogs
 */
object DataSource {

    val Books: List<Book> = listOf(
        Book(
            R.drawable.the_magic_of_thinking_big,
            "The Magic of Thinking Big",
            "David Schwartz",
            "4.2/5"
        ),
        Book(
            R.drawable.rich_dad_poor_dad,
            "Rich Dad Poor Dad",
            "Robert Kiyosaki",
            "4.1/5"
        ),
        Book(
            R.drawable.atomic_habits,
            "Atomic Habits",
            "James Clear",
            "4.4/5"
        ),
        Book(
            R.drawable.the_one_thing,
            "The ONE Thing",
            "Gary Keller",
            "4.1/5"
        ),
        Book(
            R.drawable.how_to_win_friends,
            "How to win friends and influence people",
            "Dale Carnegie",
            "4.2/5"
        ),
        Book(
            R.drawable.think_and_grow_rich,
            "Think and Grow Rich",
            "Napoleon Hill",
            "4.2/5"
        ),
        Book(
            R.drawable.the_untethered_soul,
            "The Untethered Soul",
            "Michael Singer",
            "4.2/5"
        ),
        Book(
            R.drawable.the_subtle_art_of_not_giving_a_fuck,
            "The Subtle Art of Not Giving a F*ck",
            "Mark Manson",
            "3.9/5"
        ),
        Book(
            R.drawable.the_alchemist,
            "The Alchemist",
            "Paulo Coelho",
            "3.9/5"
        ),
        Book(
            R.drawable.the_psychology_of_money,
            "The Psychology of Money",
            "Morgan Housel",
            "4.4/5"
        )
    )
}