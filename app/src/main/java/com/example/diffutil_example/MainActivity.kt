package com.example.diffutil_example

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.diffutil_example.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val repository = ActorRepository()
    private val actorAdapter = ActorAdapter(repository.actorsSortedByRating)

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = actorAdapter
        }

        binding.btnSortByName.setOnClickListener {
            actorAdapter.swap(repository.actorsSortedByName)
        }

        binding.btnSortByRatings.setOnClickListener {
            actorAdapter.swap(repository.actorsSortedByRating)
        }

        binding.btnSortByYOB.setOnClickListener {
            actorAdapter.swap(repository.actorsSortedByYearOfBirth)
        }
    }
}