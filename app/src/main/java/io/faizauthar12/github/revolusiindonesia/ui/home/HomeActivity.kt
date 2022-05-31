package io.faizauthar12.github.revolusiindonesia.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.faizauthar12.github.revolusiindonesia.R
import io.faizauthar12.github.revolusiindonesia.databinding.ActivityHomeBinding
import io.faizauthar12.github.revolusiindonesia.databinding.ContentHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var contentHome: ContentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        contentHome = binding.contentHome
        setSupportActionBar(binding.toolbar)
    }
}