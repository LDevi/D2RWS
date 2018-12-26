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

package ldev.net.d2.datasource.repository

import ldev.net.d2.datasource.adapter.toGem
import ldev.net.d2.datasource.adapter.toRune
import ldev.net.d2.datasource.local.room.database.Database
import ldev.net.d2.items.core.datasource.entity.GemDataSource
import ldev.net.d2.items.core.entity.Gem
import ldev.net.d2.items.core.entity.Rune

class GemRepository constructor(val database: Database) : GemDataSource {
    override fun getAllGems(): List<Gem> = database.gemDao().getAllGems().map { it.toGem() }
    override fun getAllRunes(): List<Rune> = database.gemDao().getAllRunes().map { it.toRune() }
    override fun getRune(runeId: String) = database.gemDao().findGemByCode(runeId)?.toRune()

}