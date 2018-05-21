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

package ldev.net.d2.datasource.local.room.database

import android.arch.persistence.db.framework.AssetSQLiteOpenHelperFactory
import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import ldev.net.d2.datasource.local.room.dao.GemDao
import ldev.net.d2.datasource.local.room.entity.Gem

@Database(entities = [(Gem::class)], version = 1, exportSchema = false)
abstract class Database : RoomDatabase() {

    abstract fun gemDao(): GemDao

    companion object {
        fun buildDatabase(context: Context): ldev.net.d2.datasource.local.room.database.Database {
            return Room.databaseBuilder(context,
                    ldev.net.d2.datasource.local.room.database.Database::class.java, "d2-database.db")
                    .openHelperFactory(AssetSQLiteOpenHelperFactory())
                    .build()
        }
    }
}