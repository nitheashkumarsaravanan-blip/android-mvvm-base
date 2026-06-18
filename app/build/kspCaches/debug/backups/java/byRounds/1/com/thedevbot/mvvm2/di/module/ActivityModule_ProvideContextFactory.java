package com.thedevbot.mvvm2.di.module;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata("com.thedevbot.mvvm2.di.ActivityContext")
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
public final class ActivityModule_ProvideContextFactory implements Factory<Context> {
  private final ActivityModule module;

  private ActivityModule_ProvideContextFactory(ActivityModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideContext(module);
  }

  public static ActivityModule_ProvideContextFactory create(ActivityModule module) {
    return new ActivityModule_ProvideContextFactory(module);
  }

  public static Context provideContext(ActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideContext());
  }
}
