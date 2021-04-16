package com.example.usatoday.views.mainScreenFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.usatoday.R
import com.example.usatoday.data.model.Response
import com.example.usatoday.viewmodel.USATodayViewModel
import com.example.usatoday.views.adapters.SubSectionAdapter
import kotlinx.android.synthetic.main.fragment_sub_section.*
import kotlinx.android.synthetic.main.news_item_layout.view.*

class SubSectionFragment : Fragment() {

    private val list = mutableListOf<Response>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sub_section, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val id: Int = requireArguments().getInt("id")

        rvSubSection.layoutManager = LinearLayoutManager(activity)
        val subSectionAdapter = SubSectionAdapter(list)
        rvSubSection.adapter = subSectionAdapter

        val usaTodayViewModel = ViewModelProviders.of(this).get(USATodayViewModel::class.java)

        when (id) {
            1 -> {
                Glide.with(this).load(R.drawable.sports_logo).into(ivSubSectionLogo)
                usaTodayViewModel.getAllOlympicsNews().observe(viewLifecycleOwner, Observer {
                    val result = it.data!!
                    list.addAll(result)
                    subSectionAdapter.notifyDataSetChanged()
                })
            }

            2 -> {
                Glide.with(this).load(R.drawable.entertainment_logo).into(ivSubSectionLogo)
                usaTodayViewModel.getAllMoviesNews().observe(viewLifecycleOwner, Observer {
                    val result = it.data!!
                    list.addAll(result)
                    subSectionAdapter.notifyDataSetChanged()
                })
            }

            3 -> {
                Glide.with(this).load(R.drawable.money_logo).into(ivSubSectionLogo)
                usaTodayViewModel.getAllFinanceNews().observe(viewLifecycleOwner, Observer {
                    val result = it.data!!
                    list.addAll(result)
                    subSectionAdapter.notifyDataSetChanged()
                })
            }

            4 -> {
                Glide.with(this).load(R.drawable.tech_logo).into(ivSubSectionLogo)
                usaTodayViewModel.getAllTechNews().observe(viewLifecycleOwner, Observer {
                    val result = it.data!!
                    list.addAll(result)
                    subSectionAdapter.notifyDataSetChanged()
                })
            }

            5 -> {
                Glide.with(this).load(R.drawable.travel_logo).into(ivSubSectionLogo)
                usaTodayViewModel.getAllDestinationNews().observe(viewLifecycleOwner, Observer {
                    val result = it.data!!
                    list.addAll(result)
                    subSectionAdapter.notifyDataSetChanged()
                })
            }

            6 -> {
                Glide.with(this).load(R.drawable.travel_logo).into(ivSubSectionLogo)
                usaTodayViewModel.getAllAirlineNews().observe(viewLifecycleOwner, Observer {
                    val result = it.data!!
                    list.addAll(result)
                    subSectionAdapter.notifyDataSetChanged()
                })
            }
        }

    }
}