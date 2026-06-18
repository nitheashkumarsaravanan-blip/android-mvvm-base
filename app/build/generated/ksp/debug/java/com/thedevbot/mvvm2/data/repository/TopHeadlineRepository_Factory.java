package com.thedevbot.mvvm2.data.repository;

import com.thedevbot.mvvm2.data.api.NetworkService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class TopHeadlineRepository_Factory implements Factory<TopHeadlineRepository> {
  private final Provider<NetworkService> networkServiceProvider;

  private TopHeadlineRepository_Factory(Provider<NetworkService> networkServiceProvider) {
    this.networkServiceProvider = networkServiceProvider;
  }

  @Override
  public TopHeadlineRepository get() {
    return newInstance(networkServiceProvider.get());
  }

  public static TopHeadlineRepository_Factory create(
      Provider<NetworkService> networkServiceProvider) {
    return new TopHeadlineRepository_Factory(networkServiceProvider);
  }

  public static TopHeadlineRepository newInstance(NetworkService networkService) {
    return new TopHeadlineRepository(networkService);
  }
}
