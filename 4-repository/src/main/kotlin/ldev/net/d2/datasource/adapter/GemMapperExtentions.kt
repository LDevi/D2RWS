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

package ldev.net.d2.datasource.adapter


import ldev.net.d2.datasource.local.room.entity.Gem
import ldev.net.d2.items.core.entity.Modifier
import ldev.net.d2.items.core.entity.Rune
import ldev.net.d2.items.core.entity.Gem as ModelGem

internal fun Gem.toGem() = ModelGem(code)
internal fun Gem.toRune() = Rune(code, letter!!, levelreq, code.substring(1).toInt(), weaponMods, helmMods, shieldMods)

private val Gem.weaponMods: List<Modifier>
    get() {
        val weaponMod1 = weaponMod1Code?.let { Modifier(it, weaponMod1Param?.toIntOrNull(), weaponMod1Min!!.toInt(), weaponMod1Max!!.toInt()) }
        val weaponMod2 = weaponMod2Code?.let { Modifier(it, weaponMod2Param?.toIntOrNull(), weaponMod2Min!!.toInt(), weaponMod2Max!!.toInt()) }
        val weaponMod3 = weaponMod2Code?.let { Modifier(it, weaponMod3Param?.toIntOrNull(), weaponMod3Min!!.toInt(), weaponMod3Max!!.toInt()) }
        return listOfNotNull(weaponMod1, weaponMod2, weaponMod3)
    }
private val Gem.helmMods: List<Modifier>
    get() {
        val helmMod1 = helmMod1Code?.let { Modifier(it, helmMod1Param?.toIntOrNull(), helmMod1Min!!.toInt(), helmMod1Max!!.toInt()) }
        val helmMod2 = helmMod2Code?.let { Modifier(it, helmMod2Param?.toIntOrNull(), helmMod2Min!!.toInt(), helmMod2Max!!.toInt()) }
        val helmMod3 = helmMod3Code?.let { Modifier(it, helmMod3Param?.toIntOrNull(), helmMod3Min!!.toInt(), helmMod3Max!!.toInt()) }
        return listOfNotNull(helmMod1, helmMod2, helmMod3)
    }
private val Gem.shieldMods: List<Modifier>
    get() {
        val shieldMod1 = shieldMod1Code?.let { Modifier(it, shieldMod1Param?.toIntOrNull(), shieldMod1Min!!.toInt(), shieldMod1Max!!.toInt()) }
        val shieldMod2 = shieldMod2Code?.let { Modifier(it, shieldMod2Param?.toIntOrNull(), shieldMod2Min!!.toInt(), shieldMod2Max!!.toInt()) }
        val shieldMod3 = shieldMod3Code?.let { Modifier(it, shieldMod3Param?.toIntOrNull(), shieldMod3Min!!.toInt(), shieldMod3Max!!.toInt()) }
        return listOfNotNull(shieldMod1, shieldMod2, shieldMod3)
    }
