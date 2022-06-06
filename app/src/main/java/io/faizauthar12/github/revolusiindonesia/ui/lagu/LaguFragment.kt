package io.faizauthar12.github.revolusiindonesia.ui.lagu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.faizauthar12.github.revolusiindonesia.databinding.FragmentLaguBinding

class LaguFragment : Fragment() {
    // binding support
    private lateinit var binding: FragmentLaguBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // binding support
        binding = FragmentLaguBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}