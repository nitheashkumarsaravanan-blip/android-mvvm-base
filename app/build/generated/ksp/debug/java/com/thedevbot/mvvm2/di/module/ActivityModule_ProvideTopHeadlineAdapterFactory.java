package com.thedevbot.mvvm2.di.module;

import com.thedevbot.mvvm2.ui.topheadline.TopHeadlineAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class ActivityModule_ProvideTopHeadlineAdapterFactory implements Factory<TopHeadlineAdapter> {
  private final ActivityModule module;

  private ActivityModule_ProvideTopHeadlineAdapterFactory(ActivityModule module) {
    this.module = module;
  }

  @Override
  public TopHeadlineAdapter get() {
    return provideTopHeadlineAdapter(module);
  }

  public static ActivityModule_ProvideTopHeadlineAdapterFactory create(ActivityModule module) {
    return new ActivityModule_ProvideTopHeadlineAdapterFactory(module);
  }

  public static TopHeadlineAdapter provideTopHeadlineAdapter(ActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideTopHeadlineAdapter());
  }
}
