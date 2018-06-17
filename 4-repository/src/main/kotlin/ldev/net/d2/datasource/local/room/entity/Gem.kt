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

package ldev.net.d2.datasource.local.room.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "gems")
data class Gem(
        @ColumnInfo(name = "code")
        @PrimaryKey var code: String,
        @ColumnInfo(name = "letter") var letter: String?,
        @ColumnInfo(name="levelreq") var levelreq:Int,
        @ColumnInfo(name="weaponMod1Code")var weaponMod1Code:String?,
        @ColumnInfo(name="weaponMod1Param")var weaponMod1Param:String?,
        @ColumnInfo(name="weaponMod1Min")var weaponMod1Min:String?,
        @ColumnInfo(name="weaponMod1Max")var weaponMod1Max:String?,
        @ColumnInfo(name="weaponMod2Code")var weaponMod2Code:String?,
        @ColumnInfo(name="weaponMod2Param")var weaponMod2Param:String?,
        @ColumnInfo(name="weaponMod2Min")var weaponMod2Min:String?,
        @ColumnInfo(name="weaponMod2Max")var weaponMod2Max:String?,
        @ColumnInfo(name="weaponMod3Code")var weaponMod3Code:String?,
        @ColumnInfo(name="weaponMod3Param")var weaponMod3Param:String?,
        @ColumnInfo(name="weaponMod3Min")var weaponMod3Min:String?,
        @ColumnInfo(name="weaponMod3Max")var weaponMod3Max:String?,
        @ColumnInfo(name="helmMod1Code")var helmMod1Code:String?,
        @ColumnInfo(name="helmMod1Param")var helmMod1Param:String?,
        @ColumnInfo(name="helmMod1Min")var helmMod1Min:String?,
        @ColumnInfo(name="helmMod1Max")var helmMod1Max:String?,
        @ColumnInfo(name="helmMod2Code")var helmMod2Code:String?,
        @ColumnInfo(name="helmMod2Param")var helmMod2Param:String?,
        @ColumnInfo(name="helmMod2Min")var helmMod2Min:String?,
        @ColumnInfo(name="helmMod2Max")var helmMod2Max:String?,
        @ColumnInfo(name="helmMod3Code")var helmMod3Code:String?,
        @ColumnInfo(name="helmMod3Param")var helmMod3Param:String?,
        @ColumnInfo(name="helmMod3Min")var helmMod3Min:String?,
        @ColumnInfo(name="helmMod3Max")var helmMod3Max:String?,
        @ColumnInfo(name="shieldMod1Code")var shieldMod1Code:String?,
        @ColumnInfo(name="shieldMod1Param")var shieldMod1Param:String?,
        @ColumnInfo(name="shieldMod1Min")var shieldMod1Min:String?,
        @ColumnInfo(name="shieldMod1Max")var shieldMod1Max:String?,
        @ColumnInfo(name="shieldMod2Code")var shieldMod2Code:String?,
        @ColumnInfo(name="shieldMod2Param")var shieldMod2Param:String?,
        @ColumnInfo(name="shieldMod2Min")var shieldMod2Min:String?,
        @ColumnInfo(name="shieldMod2Max")var shieldMod2Max:String?,
        @ColumnInfo(name="shieldMod3Code")var shieldMod3Code:String?,
        @ColumnInfo(name="shieldMod3Param")var shieldMod3Param:String?,
        @ColumnInfo(name="shieldMod3Min")var shieldMod3Min:String?,
        @ColumnInfo(name="shieldMod3Max")var shieldMod3Max:String?
)