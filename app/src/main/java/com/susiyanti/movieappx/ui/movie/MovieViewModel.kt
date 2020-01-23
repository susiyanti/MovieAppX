package com.susiyanti.movieappx.ui.movie

import android.content.res.TypedArray
import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.susiyanti.movieappx.DataDummy
import com.susiyanti.movieappx.Movie
import com.susiyanti.movieappx.R

class MovieViewModel : ViewModel() {

    fun getMovies(): ArrayList<Movie> {
        return DataDummy.listMovie
    }

}