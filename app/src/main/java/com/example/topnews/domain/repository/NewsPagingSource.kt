package com.example.topnews.domain.repository

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.topnews.api.NewsApi
import com.example.topnews.domain.data.Results
import retrofit2.HttpException
import java.io.IOException

private const val STARTING_PAGE_INDEX = 1

class NewsPagingSource(private val newsApi: NewsApi, private val section: String) : PagingSource<Int, Results>() {
    override fun getRefreshKey(state: PagingState<Int, Results>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Results> {
        val position = params.key ?: STARTING_PAGE_INDEX

        return try {
            val news = newsApi.getNewsApi(section)
            Log.d("MyLog", news.toString())
            LoadResult.Page(
                data = news.results,
                prevKey = if (position == STARTING_PAGE_INDEX) null else position - 1,
                nextKey = if (news.results.isEmpty()) null else position + 1
            )
        } catch (exception: IOException) {
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            LoadResult.Error(exception)
        } catch (exception: Throwable) {
            LoadResult.Error(exception)
        }
}
}
