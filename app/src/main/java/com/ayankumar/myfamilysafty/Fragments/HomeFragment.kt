package com.ayankumar.myfamilysafty.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ayankumar.myfamilysafty.Adapter.MemberAdapter
import com.ayankumar.myfamilysafty.DataModel.MemberModel
import com.ayankumar.myfamilysafty.R

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listOfMember = listOf(
            MemberModel(
                "Ayan", "dgfhhg",
                "Busy", "22KM", "10"
            ),
            MemberModel(
                "Alex", "dgfhhg",
                "At Gym", "9KM", "10"
            ),
            MemberModel(
                "Biswajit", "dgfhhg",
                "At Work", "11KM", "10"
            ),MemberModel(
                "Ayan", "dgfhhg",
                "Busy", "22KM", "10"
            ),
            MemberModel(
                "Alex", "dgfhhg",
                "At Gym", "9KM", "10"
            ),
            MemberModel(
                "Biswajit", "dgfhhg",
                "At Work", "11KM", "10"
            )

        )

        val adapter = MemberAdapter(listOfMember)
        val recyclerView = requireView().findViewById<RecyclerView>(R.id.rv_person)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}