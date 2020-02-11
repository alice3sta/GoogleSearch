package com.example.mygooglesearch.network

import com.example.mygooglesearch.SearchResultResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


interface GoogleSearchApi {
    @GET("/customsearch/v1")
    fun getSearchResult(
        @Query("key") key: String,
        @Query("cx") id: String,
        @Query("q") requestName: String,
        @Query("num") num : Int = 10
    ): Observable<SearchResultResponse>
}