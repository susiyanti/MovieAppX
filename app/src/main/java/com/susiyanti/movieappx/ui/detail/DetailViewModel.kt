package com.susiyanti.movieappx.ui.detail

import androidx.lifecycle.ViewModel
import com.susiyanti.movieappx.DataDummy
import com.susiyanti.movieappx.Movie

class DetailViewModel : ViewModel(){

    fun getMovie(i: Int): Movie {
        return DataDummy.listMovie.get(i)
    }

    fun getTvShow(i: Int): Movie {
        return DataDummy.listTvShow.get(i)
    }
}