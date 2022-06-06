package io.faizauthar12.github.revolusiindonesia.ui.pancasila

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import io.faizauthar12.github.revolusiindonesia.R
import io.faizauthar12.github.revolusiindonesia.databinding.ContentPancasilaBinding
import io.faizauthar12.github.revolusiindonesia.databinding.FragmentPancasilaBinding

class PancasilaFragment : Fragment() {
    // binding support
    private lateinit var binding: FragmentPancasilaBinding
    private lateinit var contentPancasila: ContentPancasilaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // binding support
        binding = FragmentPancasilaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            contentPancasila = binding.contentPancasila

            Glide.with(this)
                .load(R.drawable.pancasila)
                .into(contentPancasila.ivPancasila)
        }
    }
}