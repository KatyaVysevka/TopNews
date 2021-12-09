package com.example.topnews.ui.listfragment

import android.content.SharedPreferences
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.forEach
import androidx.fragment.app.Fragment
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.paging.LoadState
import androidx.preference.PreferenceManager
import com.example.topnews.R
import com.example.topnews.databinding.FragmentListBinding
import com.example.topnews.domain.data.Results
import com.google.android.material.chip.Chip
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.collect

@OptIn(InternalCoroutinesApi::class)
@AndroidEntryPoint
class ListFragment : Fragment(), NewsListAdapter.OnItemClickListener {
    private val viewModel by viewModels<ListViewModel>()
    private var _binding: FragmentListBinding? = null
    private val binding: FragmentListBinding get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = NewsListAdapter(this)

        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.news.collect { data ->
                adapter.submitData(viewLifecycleOwner.lifecycle, data)
            }
        }

        binding.apply {
            recyclerView.setHasFixedSize(true)
            recyclerView.itemAnimator = null
            recyclerView.adapter = adapter.withLoadStateHeaderAndFooter(
                header = NewsLoadStateAdapter { adapter.retry() },
                footer = NewsLoadStateAdapter { adapter.retry() }
            )
            buttonRetry.setOnClickListener {
                adapter.retry()
            }
            chipGroup.setOnCheckedChangeListener { _, checkedId ->
                val checkedId = chipGroup.checkedChipId
                var chosenChip: Chip? = null
                chipGroup.forEach { if (it.id == checkedId) chosenChip = it as Chip }
                val section = chosenChip?.text.toString()
                recyclerView.scrollToPosition(0)
                viewModel.choseSection(section)
            }
        }

        adapter.addLoadStateListener { loadState ->
            binding.apply {
                progressBar.isVisible = loadState.refresh is LoadState.Loading
                recyclerView.isVisible = loadState.refresh is LoadState.NotLoading
                buttonRetry.isVisible = loadState.refresh is LoadState.Error
                textViewError.isVisible = loadState.refresh is LoadState.Error
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
            R.id.settings -> findNavController().navigate(R.id.action_listFragment_to_settingsFragment)
        }
        return super.onOptionsItemSelected(item)
    }

    var listenerSettings: SharedPreferences.OnSharedPreferenceChangeListener =
        SharedPreferences.OnSharedPreferenceChangeListener { preference, key ->
            val value = preference.getBoolean(key, false)
            when (value) {
                false -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                true -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
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

    override fun onItemClick(results: Results) {
        val action = ListFragmentDirections.actionListFragmentToDetailFragment(results)
        findNavController().navigate(action)
    }
}


