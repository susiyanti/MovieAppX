package com.susiyanti.movieappx.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.susiyanti.movieappx.DataDummy
import com.susiyanti.movieappx.Movie

class TvShowViewModel : ViewModel() {

    fun getTvShows(): ArrayList<Movie> {
        return DataDummy.listTvShow
    }
}