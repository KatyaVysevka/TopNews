package com.example.topnews.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ%\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/example/topnews/api/NewsApi;", "", "getNewsApi", "Lcom/example/topnews/domain/data/News;", "section", "", "apiKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface NewsApi {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.topnews.api.NewsApi.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.nytimes.com/svc/topstories/v2/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCESS_KEY = "GirMSAG07vxCgsEzzABVNJyV7JQBg6CS";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "{section}.json")
    public abstract java.lang.Object getNewsApi(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "section")
    java.lang.String section, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api-key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.topnews.domain.data.News> continuation);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/topnews/api/NewsApi$Companion;", "", "()V", "ACCESS_KEY", "", "BASE_URL", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "https://api.nytimes.com/svc/topstories/v2/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ACCESS_KEY = "GirMSAG07vxCgsEzzABVNJyV7JQBg6CS";
        
        private Companion() {
            super();
        }
    }
}