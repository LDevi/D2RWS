package ldev.net.d2.app.assistant.android.resources.extension.android

import android.content.Intent

inline fun <reified T> Intent.toInput(): T = getSerializableExtra(T::class.java.name) as T