package io.faizauthar12.github.revolusiindonesia.ui.sejarah

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import io.faizauthar12.github.revolusiindonesia.R
import io.faizauthar12.github.revolusiindonesia.databinding.ContentSejarahBinding
import io.faizauthar12.github.revolusiindonesia.databinding.FragmentSejarahBinding

class SejarahFragment : Fragment() {

    // binding support
    private lateinit var binding: FragmentSejarahBinding
    private lateinit var contentSejarah: ContentSejarahBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSejarahBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            contentSejarah = binding.contentSejarah

            Glide.with(this)
                .load(R.drawable.sejarah)
                .into(contentSejarah.ivSejarah)
        }
    }
}