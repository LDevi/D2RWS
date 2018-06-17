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

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_socketable_list.*
import kotlinx.android.synthetic.main.list_item_socketable_view.view.*
import ldev.net.d2.app.assistant.android.feature.R
import ldev.net.d2.app.assistant.android.feature.runes.details.RuneDetailsIntent
import ldev.net.d2.app.assistant.android.feature.runes.di.dagger.tools.ViewModelFactory
import ldev.net.d2.app.assistant.android.feature.runes.extention.toIcon
import ldev.net.d2.app.assistant.android.resources.extension.android.inflate
import ldev.net.d2.items.core.entity.Rune
import org.jetbrains.anko.doAsync
import javax.inject.Inject

class RuneListActivity : AppCompatActivity() {
    @Inject
    protected lateinit var runeListViewModelFactory: ViewModelFactory<RuneListViewModel>
    private lateinit var runeListViewModel: RuneListViewModel

    data class Model(val runeList: List<Rune>)

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        runeListViewModel = ViewModelProviders.of(this, runeListViewModelFactory).get(RuneListViewModel::
        class.java)
        setContentView(R.layout.activity_socketable_list)


        runeListViewModel.runeList.observe(this, Observer {
            if (it != null) {
                runesRecyclerView.adapter = SocketableAdapter(it.runeList, { rune: Rune -> onRuneSelected(rune) })
            }
        })
        doAsync {
            runeListViewModel.loadRunes()
        }

    }

    private fun onRuneSelected(rune: Rune) {
        startActivity(RuneDetailsIntent(rune))
    }
}

class SocketableAdapter(private val runeList: List<Rune>, private val clickListener: (Rune) -> Unit) : RecyclerView.Adapter<SocketableAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(runeList[position], clickListener)
    }

    override fun getItemCount(): Int = runeList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(parent.inflate(R.layout.list_item_socketable_view))


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(rune: Rune, clickListener: (Rune) -> Unit) {
            with(itemView) {
                runeIcon.setImageResource(rune.toIcon(context))
                runeName.text = rune.name
                setOnClickListener { clickListener(rune) }
            }
        }
    }
}

