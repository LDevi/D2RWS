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
import ldev.net.d2.items.core.entity.ModifierParam
import ldev.net.d2.items.core.entity.Rune
import ldev.net.d2.items.core.entity.Gem as ModelGem

internal fun Gem.toGem() = ModelGem(id = code)
internal fun Gem.toRune() = Rune(
        id = code,
        name = letter
                ?: "null",
        minLevel = levelreq,
        runeNumber = code.substring(1).toInt(),
        weaponMods = weaponMods,
        helmMods = helmMods,
        shieldMods = shieldMods
)

private val Gem.weaponMods: List<Modifier>
    get() {
        return listOfNotNull(
                weaponMod1Code?.let {
                    Modifier(code = it,
                            param = ModifierParam(
                                    id = weaponMod1Param?.toIntOrNull(),
                                    min = weaponMod1Min?.toIntOrNull(),
                                    max = weaponMod1Max?.toIntOrNull()
                            ))
                },
                weaponMod2Code?.let {
                    Modifier(code = it,
                            param = ModifierParam(
                                    id = weaponMod2Param?.toIntOrNull(),
                                    min = weaponMod2Min?.toIntOrNull(),
                                    max = weaponMod2Max?.toIntOrNull()
                            ))
                },
                weaponMod3Code?.let {
                    Modifier(code = it,
                            param = ModifierParam(
                                    id = weaponMod3Param?.toIntOrNull(),
                                    min = weaponMod3Min?.toIntOrNull(),
                                    max = weaponMod3Max?.toIntOrNull()
                            ))
                }
        )
    }

private val Gem.helmMods: List<Modifier>
    get() {
        return listOfNotNull(
                helmMod1Code?.let {
                    Modifier(code = it,
                            param = ModifierParam(
                                    id = helmMod1Param?.toIntOrNull(),
                                    min = helmMod1Min?.toIntOrNull(),
                                    max = helmMod1Max?.toIntOrNull()
                            ))
                },
                helmMod2Code?.let {
                    Modifier(code = it,
                            param = ModifierParam(
                                    id = helmMod2Param?.toIntOrNull(),
                                    min = helmMod2Min?.toIntOrNull(),
                                    max = helmMod2Max?.toIntOrNull()
                            ))
                },
                helmMod3Code?.let {
                    Modifier(code = it,
                            param = ModifierParam(
                                    id = helmMod3Param?.toIntOrNull(),
                                    min = helmMod3Min?.toIntOrNull(),
                                    max = helmMod3Max?.toIntOrNull()
                            ))
                }
        )

    }
private val Gem.shieldMods: List<Modifier>
    get() {
        return listOfNotNull(
                shieldMod1Code?.let {
                    Modifier(code = it,
                            param = ModifierParam(
                                    id = shieldMod1Param?.toIntOrNull(),
                                    min = shieldMod1Min?.toIntOrNull(),
                                    max = shieldMod1Max?.toIntOrNull()
                            ))
                },
                shieldMod2Code?.let {
                    Modifier(code = it,
                            param = ModifierParam(
                                    id = shieldMod2Param?.toIntOrNull(),
                                    min = shieldMod2Min?.toIntOrNull(),
                                    max = shieldMod2Max?.toIntOrNull()
                            ))
                },
                shieldMod3Code?.let {
                    Modifier(code = it,
                            param = ModifierParam(
                                    id = shieldMod3Param?.toIntOrNull(),
                                    min = shieldMod3Min?.toIntOrNull(),
                                    max = shieldMod3Max?.toIntOrNull()
                            ))
                }
        )
    }
