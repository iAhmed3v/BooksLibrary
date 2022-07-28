package com.ahmed3v.bookslibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahmed3v.bookslibrary.adapter.BookCardAdapter
import com.ahmed3v.bookslibrary.const.Layout
import com.ahmed3v.bookslibrary.data.DataSource
import com.ahmed3v.bookslibrary.databinding.ActivityHorizontalListBinding

class HorizontalListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHorizontalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = DataSource.Books


        binding.horizontalRecyclerView.adapter = BookCardAdapter(
            applicationContext,
            Layout.HORIZONTAL,
            myDataset
        )

        // Specify fixed size to improve performance
        binding.horizontalRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}