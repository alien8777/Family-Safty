package com.ayankumar.myfamilysafty.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ayankumar.myfamilysafty.DataModel.MemberModel
import com.ayankumar.myfamilysafty.R

class MemberAdapter(private val listOfMember: List<MemberModel>) :
    RecyclerView.Adapter<MemberAdapter.ViewHolder>() {
    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        var profileName = item.findViewById<TextView>(R.id.tv_person_name)
        var locationDistance = item.findViewById<TextView>(R.id.tv_location_distance)
        var status = item.findViewById<TextView>(R.id.tv_person_description)
        var range = item.findViewById<TextView>(R.id.tv_range)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val item = inflater.inflate(R.layout.person_details_layout, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: MemberAdapter.ViewHolder, position: Int) {
        val item = listOfMember.get(position)
        holder.profileName.text = item.name
        holder.locationDistance.text = item.locationDistance
        holder.status.text = item.status
        holder.range.text = item.wifiRange
    }

    override fun getItemCount(): Int {
        return listOfMember.size
    }
}