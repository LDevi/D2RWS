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
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_rune_details.*
import ldev.net.d2.app.assistant.android.di.tools.ViewModelFactory
import ldev.net.d2.app.assistant.android.feature.R
import ldev.net.d2.app.assistant.android.feature.runes.extention.toIcon
import ldev.net.d2.app.assistant.android.resources.extension.android.toInput
import ldev.net.d2.app.assistant.android.resources.extension.android.viewModelProvider
import org.jetbrains.anko.doAsync
import java.io.Serializable
import javax.inject.Inject

class RuneDetailsActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory<RuneDetailsViewModel>
    private val viewModel: RuneDetailsViewModel by lazy {
        viewModelProvider(viewModelFactory)
    }


    data class Input(val runeId: String) : Serializable

    private val input by lazy {
        intent.toInput<Input>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rune_details)

        viewModel.details.observe(this, Observer { model ->
            model?.let {
                runeName.text = it.name
                runeImage.setImageResource(it.toIcon(this))
                runeImage.contentDescription = getString(R.string.accessibility_rune_image_description, it.name)
                runeNumber.text = getString(R.string.rune_number_format, it.runeNumber)
                runeLvl.text = getString(R.string.rune_min_level, it.minLevel)
                weaponMods.text = it.weaponMods.map { mod ->
                    "${mod.code} =  ${mod.param} : ${mod.param?.min ?: "null"} - ${mod.param?.max ?: "null"}"
                }.toString()
                helmMods.text = it.helmMods.map { mod ->
                    "${mod.code} =  ${mod.param} : ${mod.param?.min ?: "null"} - ${mod.param?.max ?: "null"}"
                }.toString()
                shieldMods.text = it.shieldMods.map { mod ->
                    "${mod.code} =  ${mod.param} : ${mod.param?.min ?: "null"} - ${mod.param?.max ?: "null"}"
                }.toString()
            }
        })
        doAsync {
            viewModel.loadDetails(input.runeId)
        }
    }

    companion object {
        fun intent(context: Context, input: Input): Intent =
                Intent(context, RuneDetailsActivity::class.java).putExtra(
                        Input::class.java.name,
                        input
                )
    }
}


