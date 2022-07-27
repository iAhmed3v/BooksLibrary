package com.ahmed3v.bookslibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahmed3v.bookslibrary.adapter.BookCardAdapter
import com.ahmed3v.bookslibrary.const.Layout
import com.ahmed3v.bookslibrary.databinding.ActivityGridListBinding

class GridListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGridListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = BookCardAdapter(
            applicationContext,
            Layout.GRID
        )

        // Specify fixed size to improve performance
        binding.gridRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}