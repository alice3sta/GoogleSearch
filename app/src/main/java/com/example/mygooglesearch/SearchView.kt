package com.example.mygooglesearch

interface SearchView {
    fun showResult(searchResult: List<SearchResult>)
    fun getSearchQuery(): String
}