package com.example.topnews;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = NewsApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface NewsApplication_GeneratedInjector {
  void injectNewsApplication(NewsApplication newsApplication);
}
