package com.example.mygooglesearch

import io.reactivex.Observable

interface SearchRepo {
    fun getResult(searchValue: String): Observable<List<SearchResult>>
}
