package com.example.topnews.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/topnews/domain/repository/NewsRepository;", "", "newsApi", "Lcom/example/topnews/api/NewsApi;", "(Lcom/example/topnews/api/NewsApi;)V", "getResults", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/example/topnews/domain/data/Results;", "app_debug"})
@javax.inject.Singleton()
public final class NewsRepository {
    private final com.example.topnews.api.NewsApi newsApi = null;
    
    @javax.inject.Inject()
    public NewsRepository(@org.jetbrains.annotations.NotNull()
    com.example.topnews.api.NewsApi newsApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.example.topnews.domain.data.Results>> getResults() {
        return null;
    }
}