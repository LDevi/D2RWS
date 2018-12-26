package ldev.net.d2.app.assistant.android.resources.extension.android

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.FragmentActivity
import ldev.net.d2.app.assistant.android.di.tools.ViewModelFactory

inline fun <reified T : ViewModel> FragmentActivity.viewModelProvider(viewModelFactory: ViewModelFactory<T>) =
        ViewModelProviders.of(this, viewModelFactory).get(T::class.java)