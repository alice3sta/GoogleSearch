package com.example.mygooglesearch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jakewharton.rxbinding2.widget.RxTextView
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity(), SearchView {

    val presenter: SearchPresenter = SearchPresenter(this, SearchInteractorImpl(SearchRepoImpl()))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RxTextView.afterTextChangeEvents(search_field)
            .skipInitialValue()
            .debounce(700, TimeUnit.MILLISECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                presenter.getSearchResult()
            })
    }

    override fun getSearchQuery(): String {
        return search_field.text.toString()
    }


    override fun showResult(searchResult: List<SearchResult>) {
        val searchAdapter = SearchAdapter(searchResult)
        search_result_list.adapter = searchAdapter
        search_result_list.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        search_result_list.setHasFixedSize(true)
    }
}
