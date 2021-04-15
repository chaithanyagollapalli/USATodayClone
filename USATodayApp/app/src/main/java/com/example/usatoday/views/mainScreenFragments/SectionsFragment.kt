package com.example.usatoday.views.mainScreenFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.replace
import com.example.usatoday.R
import kotlinx.android.synthetic.main.fragment_sections.*


class SectionsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sections, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvOlympicsSections.setOnClickListener {
            changeFragment(1)
        }

        tvMoviesSections.setOnClickListener {
            changeFragment(2)
        }

        tvFinanceSections.setOnClickListener {
            changeFragment(3)
        }

        tvTechTipsSections.setOnClickListener {
            changeFragment(4)
        }

        tvDestinationsSections.setOnClickListener {
            changeFragment(5)
        }

        tvAirlinesSections.setOnClickListener {
            changeFragment(6)
        }
    }

    private fun changeFragment(id: Int) {
        val bundle = Bundle()
        val subSectionFragment = SubSectionFragment()
        val fragmentTransaction = fragmentManager?.beginTransaction()
        bundle.putInt("id", id)
        subSectionFragment.arguments = bundle
        fragmentTransaction?.replace(R.id.fragment, subSectionFragment, "subSectionFragment")
            ?.addToBackStack("sections")?.commit()
    }

}