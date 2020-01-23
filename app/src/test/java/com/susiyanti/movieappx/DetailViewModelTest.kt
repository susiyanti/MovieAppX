package com.susiyanti.movieappx

import com.susiyanti.movieappx.ui.detail.DetailViewModel
import com.susiyanti.movieappx.ui.movie.MovieViewModel
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class DetailViewModelTest {

    private lateinit var viewModel : DetailViewModel

    @Before
    fun setUp(){
        viewModel = DetailViewModel()
    }

    @Test
    fun getMovie(){
        val movies = viewModel.getMovie(0)
        Assert.assertNotNull(movies)
        Assert.assertEquals(0, movies.id)
    }
}