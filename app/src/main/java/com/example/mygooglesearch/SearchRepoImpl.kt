package com.example.mygooglesearch

import com.example.mygooglesearch.network.DataSearchApi
import io.reactivex.Observable

class SearchRepoImpl : SearchRepo {

    val keyName = Keys().keyName
    val id = Keys().id

    override fun getResult(searchValue: String): Observable<List<SearchResult>> {
        return DataSearchApi().getApi().getSearchResult(keyName, id, searchValue).map {
            return@map it.searchResult
        }
    }
}
