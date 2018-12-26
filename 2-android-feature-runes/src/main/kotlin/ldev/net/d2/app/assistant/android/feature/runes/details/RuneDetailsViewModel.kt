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

package ldev.net.d2.app.assistant.android.feature.runes.details

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import ldev.net.d2.app.assistant.android.usecase.SearchForRunesUseCase
import ldev.net.d2.items.core.entity.Rune
import javax.inject.Inject

class RuneDetailsViewModel @Inject constructor(private val searchForRunesUseCase: SearchForRunesUseCase) : ViewModel() {

    private val _details = MutableLiveData<Rune>()
    val details: LiveData<Rune> = _details

    fun loadDetails(runeId: String) =
            searchForRunesUseCase.getRune(runeId)?.let { rune ->
                _details.postValue(rune)
            }
}