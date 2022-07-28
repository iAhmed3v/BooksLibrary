package com.ahmed3v.bookslibrary.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ahmed3v.bookslibrary.R
import com.ahmed3v.bookslibrary.model.Book

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class BookCardAdapter(
    private val context: Context?,
    private val layout: Int,
    private val dataset: List<Book>
): RecyclerView.Adapter<BookCardAdapter.BookCardViewHolder>() {

    // TODO: Initialize the data using the List found in data/DataSource

    /**
     * Initialize view elements
     */
    class BookCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {

        // TODO: Declare and initialize all of the list item UI components
        val bookImage: ImageView = view!!.findViewById(R.id.book_image)
        val bookName : TextView = view!!.findViewById(R.id.book_name)
        val bookAuthor : TextView = view!!.findViewById(R.id.book_author)
        val bookRating : TextView = view!!.findViewById(R.id.book_rating)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookCardViewHolder {
        // TODO: Use a conditional to determine the layout type and set it accordingly.
        //  if the layout variable is Layout.GRID the grid list item should be used. Otherwise the
        //  the vertical/horizontal list item should be used.

        // TODO Inflate the layout
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.book_list_item, parent, false)

        // TODO: Null should not be passed into the view holder. This should be updated to reflect
        //  the inflated layout.
        return BookCardViewHolder(adapterLayout)
    }

    // TODO: return the size of the data set instead of 0
    override fun getItemCount(): Int { return dataset.size }

    override fun onBindViewHolder(holder: BookCardViewHolder, position: Int) {
        // TODO: Get the data at the current position
        val item = dataset[position]

        // TODO: Set the image resource for the current book
        holder.bookImage.setImageResource(item.imageResourceId)

        // TODO: Set the text for the current book's name
        holder.bookName.text = item.name

        // TODO: Set the text for the current book's author
        holder.bookAuthor.text = item.author

        // TODO: Set the text for the current book's rating
        holder.bookRating.text = item.rating
    }
}