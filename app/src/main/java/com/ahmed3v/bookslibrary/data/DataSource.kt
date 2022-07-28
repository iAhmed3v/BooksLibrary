package com.ahmed3v.bookslibrary.data

import com.ahmed3v.bookslibrary.R
import com.ahmed3v.bookslibrary.model.Book

/**
 * An object to generate a static list of books
 */
object DataSource {

    val Books: List<Book> = listOf(
        Book(
            R.drawable.the_magic_of_thinking_big,
            "The Magic of Thinking Big",
            "Author: David Schwartz",
            "Rating on Goodreads: 4.2/5"
        ),
        Book(
            R.drawable.rich_dad_poor_dad,
            "Rich Dad Poor Dad",
            "Author: Robert Kiyosaki",
            "Rating on Goodreads: 4.1/5"
        ),
        Book(
            R.drawable.atomic_habits,
            "Atomic Habits",
            "Author: James Clear",
            "Rating on Goodreads: 4.4/5"
        ),
        Book(
            R.drawable.the_one_thing,
            "The ONE Thing",
            "Author: Gary Keller",
            "Rating on Goodreads: 4.1/5"
        ),
        Book(
            R.drawable.how_to_win_friends,
            "How to win friends and influence people",
            "Author: Dale Carnegie",
            "Rating on Goodreads: 4.2/5"
        ),
        Book(
            R.drawable.think_and_grow_rich,
            "Think and Grow Rich",
            "Author: Napoleon Hill",
            "Rating on Goodreads: 4.2/5"
        ),
        Book(
            R.drawable.the_untethered_soul_,
            "The Untethered Soul",
            "Author: Michael Singer",
            "Rating on Goodreads: 4.2/5"
        ),
        Book(
            R.drawable.the_subtle_art_of_not_giving_a_fuck_,
            "The Subtle Art of Not Giving a F*ck",
            "Author: Mark Manson",
            "Rating on Goodreads: 3.9/5"
        ),
        Book(
            R.drawable.the_alchemist,
            "The Alchemist",
            "Author: Paulo Coelho",
            "Rating on Goodreads: 3.9/5"
        ),
        Book(
            R.drawable.the_psychology_of_money_,
            "The Psychology of Money",
            "Author: Morgan Housel",
            "Rating on Goodreads: 4.4/5"
        )
    )
}