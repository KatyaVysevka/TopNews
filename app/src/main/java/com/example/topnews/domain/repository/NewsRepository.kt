package com.example.topnews.domain.repository

import androidx.paging.*
import com.example.topnews.api.NewsApi
import com.example.topnews.domain.data.Results
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NewsRepository @Inject constructor(private val newsApi: NewsApi):Repository {

    private val appScope: CoroutineScope = CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)

    private val map: MutableMap<String, Flow<PagingData<Results>>> = mutableMapOf()


    override fun getResults(section: String) : Flow<PagingData<Results>> {
        val cachedPagerFlow = map[section]
        return if (cachedPagerFlow != null) {
            cachedPagerFlow
        } else {
            val pagerFlow = Pager(
                config = PagingConfig(
                    initialLoadSize = 20,
                    pageSize = 10,
                    maxSize = 50,
                    enablePlaceholders = false
                ),
                pagingSourceFactory = { NewsPagingSource(newsApi, section) }
            ).flow.cachedIn(appScope)
            map[section] = pagerFlow
            return pagerFlow
        }
    }
}