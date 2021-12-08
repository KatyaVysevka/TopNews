package com.example.topnews.domain.usecase

import androidx.paging.PagingData
import com.example.topnews.domain.data.Results
import com.example.topnews.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NewsUseCase @Inject constructor(private val repository: NewsRepository) {

    operator fun invoke(section: String): Flow<PagingData<Results>> {
        return repository.getResults(section)
    }
}