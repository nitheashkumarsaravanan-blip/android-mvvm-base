package com.thedevbot.mvvm2.di.module;

import com.thedevbot.mvvm2.data.repository.TopHeadlineRepository;
import com.thedevbot.mvvm2.ui.topheadline.TopHeadlineViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class ActivityModule_ProvideTopHeadlineViewModelFactory implements Factory<TopHeadlineViewModel> {
  private final ActivityModule module;

  private final Provider<TopHeadlineRepository> topHeadlineRepositoryProvider;

  private ActivityModule_ProvideTopHeadlineViewModelFactory(ActivityModule module,
      Provider<TopHeadlineRepository> topHeadlineRepositoryProvider) {
    this.module = module;
    this.topHeadlineRepositoryProvider = topHeadlineRepositoryProvider;
  }

  @Override
  public TopHeadlineViewModel get() {
    return provideTopHeadlineViewModel(module, topHeadlineRepositoryProvider.get());
  }

  public static ActivityModule_ProvideTopHeadlineViewModelFactory create(ActivityModule module,
      Provider<TopHeadlineRepository> topHeadlineRepositoryProvider) {
    return new ActivityModule_ProvideTopHeadlineViewModelFactory(module, topHeadlineRepositoryProvider);
  }

  public static TopHeadlineViewModel provideTopHeadlineViewModel(ActivityModule instance,
      TopHeadlineRepository topHeadlineRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideTopHeadlineViewModel(topHeadlineRepository));
  }
}
