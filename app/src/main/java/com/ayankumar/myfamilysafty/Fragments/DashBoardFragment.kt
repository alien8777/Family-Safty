package com.ayankumar.myfamilysafty.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ayankumar.myfamilysafty.R

class DashBoardFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dash_board, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = DashBoardFragment()
    }
}