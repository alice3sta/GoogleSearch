package com.example.mygooglesearch

import com.google.gson.annotations.SerializedName

class SearchResultResponse(@SerializedName("items") val searchResult: List<SearchResult>)
