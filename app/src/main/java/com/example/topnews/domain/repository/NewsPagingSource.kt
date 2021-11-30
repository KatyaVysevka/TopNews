package com.example.topnews.domain.repository

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.topnews.api.NewsApi
import com.example.topnews.domain.data.News
import com.example.topnews.domain.data.Results
import retrofit2.HttpException
import java.io.IOException

private const val STARTING_PAGE_INDEX = 1
private const val NEWS_SECTION = "home"

class NewsPagingSource(private val newsApi: NewsApi) : PagingSource<Int, Results>() {
    override fun getRefreshKey(state: PagingState<Int, Results>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Results> {
        val position = params.key ?: STARTING_PAGE_INDEX

        return try {
            val news = newsApi.getNewsApi(NEWS_SECTION)
            Log.d("MyLog", news.toString())
            LoadResult.Page(
                data = news.results,
                prevKey = if (position == STARTING_PAGE_INDEX) null else position - 1,
                nextKey = if (news.results.isEmpty()) null else position + 1
            )
        } catch (exception: IOException) {
            Log.d("MyLog", exception.message.toString())
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            Log.d("MyLog", exception.message.toString())
            LoadResult.Error(exception)
        } catch (exception: Throwable) {
            Log.d("MyLog", exception.message.toString())
            LoadResult.Error(exception)
        }
//        suspend fun newsRunCatching() = kotlin.runCatching {
//        }.fold(
//            onSuccess = { result ->
//                val news = newsApi.getNewsApi(NEWS_SECTION)
//                LoadResult.Page(
//                    data = news,
//                    prevKey = if (position == STARTING_PAGE_INDEX) null else position - 1,
//                    nextKey = if (news.isEmpty()) null else position + 1
//                )
//            },
//            onFailure = { throwable ->
//                LoadResult.Error(throwable)
//            }
//        )
//        return newsRunCatching()
//    }
}
}
