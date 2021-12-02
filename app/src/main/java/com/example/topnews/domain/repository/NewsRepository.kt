package com.example.topnews.domain.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.topnews.api.NewsApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NewsRepository @Inject constructor(private val newsApi: NewsApi){

    fun getResults(section: String) =
        Pager(
            config = PagingConfig(
                initialLoadSize = 20,
                pageSize = 10,
                maxSize = 50,
                enablePlaceholders = false
            ),
            pagingSourceFactory = { NewsPagingSource(newsApi, section) }
        ).liveData
}