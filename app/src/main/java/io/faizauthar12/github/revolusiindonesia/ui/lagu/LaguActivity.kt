package io.faizauthar12.github.revolusiindonesia.ui.lagu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.faizauthar12.github.revolusiindonesia.databinding.ActivityLaguBinding

class LaguActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLaguBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLaguBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}