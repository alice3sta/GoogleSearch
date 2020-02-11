package com.example.mygooglesearch


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class SearchAdapter(val searchResult: List<SearchResult>) : RecyclerView.Adapter<SearchAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_search_result, parent, false))
    }


    override fun getItemCount(): Int {
        return searchResult.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.resultTitle.text = searchResult.get(position).resultTitle
        holder.resultDescription.text = searchResult.get(position).resultDescription
        holder.resultLink.text = searchResult.get(position).resultLink
    }


    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val resultTitle = view.findViewById<TextView>(R.id.result_title)
        val resultDescription = view.findViewById<TextView>(R.id.result_description)
        val resultLink = view.findViewById<TextView>(R.id.result_website)
    }
}



