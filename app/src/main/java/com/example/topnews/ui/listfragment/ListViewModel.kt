package com.example.topnews.ui.listfragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.topnews.domain.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(private val repository: NewsRepository): ViewModel()  {
    val news = repository.getResults().cachedIn(viewModelScope)
}