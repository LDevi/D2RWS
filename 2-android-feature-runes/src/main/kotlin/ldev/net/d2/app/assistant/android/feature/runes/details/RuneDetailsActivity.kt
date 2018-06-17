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

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.annotation.DrawableRes
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_rune_details.*
import ldev.net.d2.app.assistant.android.feature.R
import ldev.net.d2.app.assistant.android.feature.runes.di.dagger.tools.ViewModelFactory
import ldev.net.d2.app.assistant.android.feature.runes.extention.toIcon
import ldev.net.d2.items.core.entity.Rune
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.image
import java.io.Serializable
import javax.inject.Inject

fun Context.RuneDetailsIntent(rune:Rune): Intent =
    Intent(this,RuneDetailsActivity::class.java).apply {
        putExtra(INTENT_RUNE_ID,rune.id)
    }

private const val INTENT_RUNE_ID = "INTENT_RUNE_ID"

class RuneDetailsActivity : AppCompatActivity() {


    @Inject
    protected lateinit var runeDetailsViewModelFactory: ViewModelFactory<RuneDetailsViewModel>
    private lateinit var runeDetailsViewModel: RuneDetailsViewModel

    data class Model(val runeName : String,
                     @DrawableRes val runeDrawableResIcon : Int,
                     val runeNumber : Int,
                     val runeMinLevel : Int,
                     val runeWeaponModifiers : List<String>)

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        runeDetailsViewModel = ViewModelProviders.of(this, runeDetailsViewModelFactory).get(RuneDetailsViewModel::
        class.java)
        setContentView(R.layout.activity_rune_details)

        runeDetailsViewModel.details.observe(this, Observer {
            if (it != null) {
                runeName.text=it.runeName
                runeImage.setImageResource(it.runeDrawableResIcon)
                runeNumber.text = "#" + it.runeNumber
                runeLvl.text ="Min level : "+ it.runeMinLevel.toString()
                weaponMods.text = it.runeWeaponModifiers.toString()
            }
        })
        doAsync {
            val runeId = intent.getStringExtra(INTENT_RUNE_ID)
            requireNotNull(runeId) { "no rune_id provided in Intent extras" }
            runeId?.let {runeDetailsViewModel.loadDetails(runeId)}
        }
    }
}
