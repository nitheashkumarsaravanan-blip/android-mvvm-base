package com.thedevbot.mvvm2.di.component

import dagger.Component
import com.thedevbot.mvvm2.di.ActivityScope
import com.thedevbot.mvvm2.di.module.ActivityModule
import com.thedevbot.mvvm2.ui.topheadline.TopHeadlineActivity

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)

}