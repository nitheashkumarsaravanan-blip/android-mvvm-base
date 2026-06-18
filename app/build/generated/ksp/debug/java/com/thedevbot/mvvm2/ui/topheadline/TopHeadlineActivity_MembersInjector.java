package com.thedevbot.mvvm2.ui.topheadline;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;

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
public final class TopHeadlineActivity_MembersInjector implements MembersInjector<TopHeadlineActivity> {
  private final Provider<TopHeadlineViewModel> topHeadlineViewModelProvider;

  private final Provider<TopHeadlineAdapter> adapterProvider;

  private TopHeadlineActivity_MembersInjector(
      Provider<TopHeadlineViewModel> topHeadlineViewModelProvider,
      Provider<TopHeadlineAdapter> adapterProvider) {
    this.topHeadlineViewModelProvider = topHeadlineViewModelProvider;
    this.adapterProvider = adapterProvider;
  }

  public static MembersInjector<TopHeadlineActivity> create(
      Provider<TopHeadlineViewModel> topHeadlineViewModelProvider,
      Provider<TopHeadlineAdapter> adapterProvider) {
    return new TopHeadlineActivity_MembersInjector(topHeadlineViewModelProvider, adapterProvider);
  }

  @Override
  public void injectMembers(TopHeadlineActivity instance) {
    injectTopHeadlineViewModel(instance, topHeadlineViewModelProvider.get());
    injectAdapter(instance, adapterProvider.get());
  }

  @InjectedFieldSignature("com.thedevbot.mvvm2.ui.topheadline.TopHeadlineActivity.topHeadlineViewModel")
  public static void injectTopHeadlineViewModel(TopHeadlineActivity instance,
      TopHeadlineViewModel topHeadlineViewModel) {
    instance.topHeadlineViewModel = topHeadlineViewModel;
  }

  @InjectedFieldSignature("com.thedevbot.mvvm2.ui.topheadline.TopHeadlineActivity.adapter")
  public static void injectAdapter(TopHeadlineActivity instance, TopHeadlineAdapter adapter) {
    instance.adapter = adapter;
  }
}
