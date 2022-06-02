package io.faizauthar12.github.revolusiindonesia.ui.pancasila

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import io.faizauthar12.github.revolusiindonesia.R
import io.faizauthar12.github.revolusiindonesia.databinding.ActivityPancasilaBinding
import io.faizauthar12.github.revolusiindonesia.databinding.ContentPancasilaBinding

class PancasilaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPancasilaBinding
    private lateinit var contentPancasila: ContentPancasilaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPancasilaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Pancasila"

        contentPancasila = binding.contentPancasila

        Glide.with(this)
            .load(R.drawable.pancasila)
            .into(contentPancasila.ivPancasila)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}