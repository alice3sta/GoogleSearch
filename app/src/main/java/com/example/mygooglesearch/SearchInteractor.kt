package com.example.mygooglesearch

import io.reactivex.Observable

interface SearchInteractor {

    fun getSearchResult(searchValue: String): Observable<List<SearchResult>>
}