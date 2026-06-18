package com.thedevbot.mvvm2.di.component

import android.content.Context
import dagger.Component
import com.thedevbot.mvvm2.MVVMApplication
import com.thedevbot.mvvm2.data.api.NetworkService
import com.thedevbot.mvvm2.data.repository.TopHeadlineRepository
import com.thedevbot.mvvm2.di.ApplicationContext
import com.thedevbot.mvvm2.di.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MVVMApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): TopHeadlineRepository

}