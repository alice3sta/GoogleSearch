package com.example.mygooglesearch

import com.google.gson.annotations.SerializedName

class SearchResult(
    @SerializedName("title") val resultTitle: String,
    @SerializedName("link") val resultLink: String,
    @SerializedName("snippet") val resultDescription: String
)
