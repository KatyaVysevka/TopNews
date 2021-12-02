package com.example.topnews.ui.detail

import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Configuration
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.util.TypedValue
import android.view.*
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.preference.PreferenceManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.example.topnews.R
import com.example.topnews.databinding.FragmentDetailBinding
import kotlinx.android.synthetic.main.item.view.*


class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding: FragmentDetailBinding get() = requireNotNull(_binding)
    private val ags by navArgs<DetailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            val photo = ags.news.multimedia?.firstOrNull()?.url

            Glide.with(this@DetailFragment)
                .load(photo)
                .error(R.drawable.ic_baseline_error_outline_24)
                .listener(object : RequestListener<Drawable> {
                    override fun onLoadFailed(
                        e: GlideException?,
                        model: Any?,
                        target: Target<Drawable>?,
                        isFirstResource: Boolean
                    ): Boolean {
                        progressBar.isVisible = false
                        return false
                    }

                    override fun onResourceReady(
                        resource: Drawable?,
                        model: Any?,
                        target: Target<Drawable>?,
                        dataSource: DataSource?,
                        isFirstResource: Boolean
                    ): Boolean {
                        progressBar.isVisible = false
                        return false
                    }
                })
                .into(imageNewsDetail)

            textTitle.text = ags.news.title
            textAbstract.text = ags.news.abstract

            val uri = Uri.parse(ags.news.url)
            val intent = Intent(Intent.ACTION_VIEW, uri)

            textLink.apply {
                text = ags.news.url
                setOnClickListener {
                    context.startActivity(intent)
                }
                paint.isUnderlineText = true
            }
        }

        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.settings_menu, menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.settings -> findNavController().navigate(R.id.action_detailFragment_to_settingsFragment2)
        }
        return super.onOptionsItemSelected(item)
    }

    var listenerSettings: SharedPreferences.OnSharedPreferenceChangeListener =
        SharedPreferences.OnSharedPreferenceChangeListener { preference, key ->
            val value = preference.getString(key, "16sp")
            when (value) {
                "14sp" -> binding.textAbstract.textSize = 14F
                "16sp" -> binding.textAbstract.textSize = 16F
                "18sp" -> binding.textAbstract.textSize = 18F
            }
        }

    override fun onResume() {
        super.onResume()
        val preferences = PreferenceManager.getDefaultSharedPreferences(requireContext())
        preferences.registerOnSharedPreferenceChangeListener(listenerSettings)

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}