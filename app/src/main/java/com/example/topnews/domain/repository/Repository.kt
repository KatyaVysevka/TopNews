package com.example.topnews.domain.repository

import androidx.paging.PagingData
import com.example.topnews.domain.data.Results
import kotlinx.coroutines.flow.Flow

interface Repository {
    fun getResults(section: String): Flow<PagingData<Results>>
}