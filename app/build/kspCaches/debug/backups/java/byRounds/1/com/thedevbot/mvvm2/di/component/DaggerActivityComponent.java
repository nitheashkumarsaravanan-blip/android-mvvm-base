package com.thedevbot.mvvm2.di.component;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.thedevbot.mvvm2.di.module.ActivityModule;
import com.thedevbot.mvvm2.di.module.ActivityModule_ProvideTopHeadlineAdapterFactory;
import com.thedevbot.mvvm2.di.module.ActivityModule_ProvideTopHeadlineViewModelFactory;
import com.thedevbot.mvvm2.ui.topheadline.TopHeadlineActivity;
import com.thedevbot.mvvm2.ui.topheadline.TopHeadlineActivity_MembersInjector;
import com.thedevbot.mvvm2.ui.topheadline.TopHeadlineViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

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
public final class DaggerActivityComponent {
  private DaggerActivityComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private ApplicationComponent applicationComponent;

    private Builder() {
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }

    public ActivityComponent build() {
      Preconditions.checkBuilderRequirement(activityModule, ActivityModule.class);
      Preconditions.checkBuilderRequirement(applicationComponent, ApplicationComponent.class);
      return new ActivityComponentImpl(activityModule, applicationComponent);
    }
  }

  private static final class ActivityComponentImpl implements ActivityComponent {
    private final ActivityModule activityModule;

    private final ApplicationComponent applicationComponent;

    private final ActivityComponentImpl activityComponentImpl = this;

    ActivityComponentImpl(ActivityModule activityModuleParam,
        ApplicationComponent applicationComponentParam) {
      this.activityModule = activityModuleParam;
      this.applicationComponent = applicationComponentParam;

    }

    TopHeadlineViewModel topHeadlineViewModel() {
      return ActivityModule_ProvideTopHeadlineViewModelFactory.provideTopHeadlineViewModel(activityModule, Preconditions.checkNotNullFromComponent(applicationComponent.getTopHeadlineRepository()));
    }

    @Override
    public void inject(TopHeadlineActivity activity) {
      injectTopHeadlineActivity(activity);
    }

    @CanIgnoreReturnValue
    private TopHeadlineActivity injectTopHeadlineActivity(TopHeadlineActivity instance) {
      TopHeadlineActivity_MembersInjector.injectTopHeadlineViewModel(instance, topHeadlineViewModel());
      TopHeadlineActivity_MembersInjector.injectAdapter(instance, ActivityModule_ProvideTopHeadlineAdapterFactory.provideTopHeadlineAdapter(activityModule));
      return instance;
    }
  }
}
