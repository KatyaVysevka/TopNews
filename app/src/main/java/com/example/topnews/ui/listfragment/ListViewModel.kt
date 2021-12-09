package com.example.topnews.ui.listfragment

import androidx.lifecycle.*
import com.example.topnews.domain.usecase.NewsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.flatMapLatest
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val newsUseCase: NewsUseCase,
    state: SavedStateHandle
) : ViewModel() {

    private val currentSection = state.getLiveData(CURRENT_SECTION, DEFAULT_SECTION)
    val news = currentSection.asFlow()
        .flatMapLatest { section -> newsUseCase.invoke(section) }

    fun choseSection(section: String) {
        currentSection.value = section
    }

    companion object{
        private const val CURRENT_SECTION = "current_query"
        private const val DEFAULT_SECTION = "home"
    }

}