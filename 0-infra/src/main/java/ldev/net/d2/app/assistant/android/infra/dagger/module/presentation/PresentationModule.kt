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

package ldev.net.d2.app.assistant.android.infra.dagger.module.presentation

import android.app.Activity
import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import ldev.net.d2.app.assistant.android.core.usecase.SearchForRunesUseCase
import ldev.net.d2.app.assistant.android.feature.runes.RunesFeature

@Module
class PresentationModule {

    @Provides
    fun providePresentation(application: Application, searchForRunesUseCase: SearchForRunesUseCase): AndroidInjector<Activity> = RunesFeature().init(application, searchForRunesUseCase)
}
