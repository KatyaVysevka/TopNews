// Generated by Dagger (https://dagger.dev).
package com.example.topnews.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  @Override
  public Retrofit get() {
    return provideRetrofit();
  }

  public static AppModule_ProvideRetrofitFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Retrofit provideRetrofit() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRetrofit());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideRetrofitFactory INSTANCE = new AppModule_ProvideRetrofitFactory();
  }
}
