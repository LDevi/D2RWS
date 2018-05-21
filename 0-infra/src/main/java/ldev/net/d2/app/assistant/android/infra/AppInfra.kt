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

package ldev.net.d2.app.assistant.android.infra

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import ldev.net.d2.app.assistant.android.infra.dagger.component.*
import javax.inject.Inject

class AppInfra(var application: Application) {

    private var appComponent: AppComponent
    private var dataSourceComponent: DataSourceComponent
    private var coreComponent: CoreComponent
    private var appCoreComponent: AppCoreComponent
    private var presentationComponent: PresentationComponent

    @Inject
    lateinit var activityInjector: AndroidInjector<Activity>

    init {
        appComponent = initAppComponent(application)
        dataSourceComponent = initDataSourceComponent(appComponent)
        coreComponent = initCoreComponent(dataSourceComponent)
        appCoreComponent = initAppCoreComponent(coreComponent)
        presentationComponent = initPresentationComponent(appCoreComponent)
    }

    private fun initPresentationComponent(appCoreComponent: AppCoreComponent): PresentationComponent = DaggerPresentationComponent.builder()
            .appCoreComponent(appCoreComponent).application(application).build().also { it.inject(this) }


    private fun initAppComponent(app: Application): AppComponent = DaggerAppComponent.builder()
            .application(app)
            .build()

    private fun initCoreComponent(dataSourceComponent: DataSourceComponent): CoreComponent = DaggerCoreComponent.builder()
            .dataSourceComponent(dataSourceComponent)
            .build()

    private fun initAppCoreComponent(coreComponent: CoreComponent): AppCoreComponent = DaggerAppCoreComponent.builder()
            .coreComponent(coreComponent)
            .build()

    private fun initDataSourceComponent(appComponent: AppComponent): DataSourceComponent = DaggerDataSourceComponent.builder()
            .appComponent(appComponent)
            .build()
}

