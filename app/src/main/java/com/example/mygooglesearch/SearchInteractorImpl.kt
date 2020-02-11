package com.example.mygooglesearch

import io.reactivex.Observable

class SearchInteractorImpl(val searchRepo: SearchRepoImpl) : SearchInteractor {

    override fun getSearchResult(searchValue: String): Observable<List<SearchResult>> {
        return searchRepo.getResult(searchValue)
    }
}
