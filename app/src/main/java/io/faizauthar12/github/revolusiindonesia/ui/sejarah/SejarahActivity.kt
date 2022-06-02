package io.faizauthar12.github.revolusiindonesia.ui.sejarah

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import io.faizauthar12.github.revolusiindonesia.R
import io.faizauthar12.github.revolusiindonesia.databinding.ActivitySejarahBinding
import io.faizauthar12.github.revolusiindonesia.databinding.ContentSejarahBinding

class SejarahActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySejarahBinding
    private lateinit var contentSejarah: ContentSejarahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySejarahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        contentSejarah = binding.contentSejarah

        Glide.with(this)
            .load(R.drawable.sejarah)
            .into(contentSejarah.ivSejarah)
    }
}