package com.example.topnews.ui.listfragment

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.topnews.domain.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val repository: NewsRepository,
    state: SavedStateHandle
) : ViewModel() {
    private val currentSection = state.getLiveData(CURRENT_SECTION, DEFAULT_SECTION)
    val news = currentSection.switchMap {section ->
        repository.getResults(section).cachedIn(viewModelScope)}

    fun choseSection (section: String){
        currentSection.value = section
    }

    companion object{
        private const val CURRENT_SECTION = "current_query"
        private const val DEFAULT_SECTION = "home"
    }
}