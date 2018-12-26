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

package ldev.net.d2.app.assistant.android.feature.runes.list

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import ldev.net.d2.app.assistant.android.usecase.SearchForRunesUseCase
import ldev.net.d2.items.core.entity.Rune
import javax.inject.Inject

class RuneListViewModel @Inject constructor(var searchForRunesUseCase: SearchForRunesUseCase) : ViewModel() {

    data class Model(val runeList: List<Rune>)

    private val _runeList: MutableLiveData<Model> = MutableLiveData()
    val runeList: LiveData<Model> = _runeList

    fun loadRunes() = _runeList.postValue(Model(searchForRunesUseCase.getAllAvailableRunes()))

}

