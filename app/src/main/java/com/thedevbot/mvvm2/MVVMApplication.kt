package com.thedevbot.mvvm2

import android.app.Application
import com.thedevbot.mvvm2.di.component.ApplicationComponent
import com.thedevbot.mvvm2.di.component.DaggerApplicationComponent
import com.thedevbot.mvvm2.di.module.ApplicationModule

class MVVMApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    private fun injectDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }

}