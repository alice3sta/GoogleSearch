package com.example.mygooglesearch

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class SearchPresenter(val view: SearchView, val interactor: SearchInteractorImpl) {

    fun getSearchResult() {
        val searchValue = view.getSearchQuery()

        interactor.getSearchResult(searchValue)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                view.showResult(it)
            }, {

            })
    }
}