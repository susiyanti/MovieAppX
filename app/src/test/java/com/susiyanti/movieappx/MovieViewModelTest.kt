package com.susiyanti.movieappx

import com.susiyanti.movieappx.ui.movie.MovieViewModel
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MovieViewModelTest {

    private lateinit var viewModel : MovieViewModel

    @Before
    fun setUp(){
        viewModel = MovieViewModel()
    }

    @Test
    fun getMovie(){
        val movies = viewModel.getMovies()
        Assert.assertNotNull(movies)
        Assert.assertEquals(2, movies.size)
    }
}