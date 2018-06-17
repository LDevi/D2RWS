package ldev.net.d2.app.assistant.android.feature.runes.di.dagger.module

import android.app.Application
import android.content.Context
import android.content.res.Resources
import dagger.Module
import dagger.Provides

@Module
class AndroidContextModule {

    @Provides
    fun provideContext(application: Application): Context = application.applicationContext

    @Provides
    fun provideResources(application: Application): Resources = application.resources
}