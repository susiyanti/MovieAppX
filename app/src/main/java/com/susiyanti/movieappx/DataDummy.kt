package com.susiyanti.movieappx

import kotlin.collections.ArrayList

object DataDummy {


    val  listMovie : ArrayList<Movie>
    get(){
        val list = arrayListOf<Movie>()
        list.add(Movie(0,"A star is born","",R.drawable.poster_a_star))
        list.add(Movie(1,"Family Guy","",R.drawable.poster_family_guy))
        return list
    }

    val listTvShow : ArrayList<Movie>
    get() {
        val list = arrayListOf<Movie>()
        list.add(Movie(0,"Arrow","",R.drawable.poster_arrow))
        list.add(Movie(1,"Aquaman","",R.drawable.poster_aquaman))
        return list
    }
}