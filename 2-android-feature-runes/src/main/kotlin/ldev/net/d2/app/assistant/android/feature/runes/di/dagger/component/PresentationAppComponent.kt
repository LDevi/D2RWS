/*
 * Copyright 2018 Louis Devineau.
 * This file is part of Diablo-2-App-Assistant.
 *
 *     Diablo-2-App-Assistant is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Diablo-2-App-Assistant is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Diablo-2-App-Assistant.  If not, see <http://www.gnu.org/licenses/>.
 */

package ldev.net.d2.app.assistant.android.feature.runes.di.dagger.component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import ldev.net.d2.app.assistant.android.feature.runes.RunesFeature
import ldev.net.d2.app.assistant.android.feature.runes.di.dagger.module.ActivityInjectorMap
import ldev.net.d2.app.assistant.android.feature.runes.di.dagger.module.AndroidContextModule
import ldev.net.d2.app.assistant.android.usecase.SearchForRunesUseCase
import javax.inject.Singleton


@Singleton
@Component(modules = [AndroidInjectionModule::class,
    ActivityInjectorMap::class,
AndroidContextModule::class
])
interface PresentationAppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        @BindsInstance
        fun searchForRunesUseCase(searchForRunesUseCase: SearchForRunesUseCase): Builder

        fun build(): PresentationAppComponent
    }

    fun inject(presentation: RunesFeature)
}