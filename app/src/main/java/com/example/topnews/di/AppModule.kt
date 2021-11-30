package com.example.topnews.di

import android.util.Log
import androidx.viewbinding.BuildConfig
import com.example.topnews.api.NewsApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

 //   @Provides
    @Singleton
    fun httpLoggingInterceptor(): HttpLoggingInterceptor {
        Log.d("TAGG", "interceptor")
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }
//    fun httpLoggingInterceptor(): HttpLoggingInterceptor =
//        if (BuildConfig.DEBUG) {
//            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
//        } else HttpLoggingInterceptor()

    val client: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(httpLoggingInterceptor())
        .connectTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .build()

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        Log.d("TAGG", "RETROFIT")
        return Retrofit.Builder()
            .baseUrl(NewsApi.BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideUnsplashApi(retrofit: Retrofit): NewsApi {
        Log.d("TAGG", "API create")

        return retrofit.create(NewsApi::class.java)
    }
}