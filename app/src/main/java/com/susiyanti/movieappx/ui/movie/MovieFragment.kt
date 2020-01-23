package com.susiyanti.movieappx.ui.movie

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.susiyanti.movieappx.ui.detail.DetailActivity
import com.susiyanti.movieappx.ListMovieAdapter
import com.susiyanti.movieappx.Movie
import com.susiyanti.movieappx.R
import kotlinx.android.synthetic.main.fragment_movie.*

class MovieFragment : Fragment() {

    private lateinit var movieViewModel: MovieViewModel
    private var movies = arrayListOf<Movie>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.fragment_movie, container, false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        rv_movie.setHasFixedSize(true)
        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel::class.java)
        movies = movieViewModel.getMovies()
        val movieAdapter = ListMovieAdapter(movies)
        rv_movie.layoutManager = LinearLayoutManager(context)
        rv_movie.adapter = movieAdapter
        movieAdapter.setOnItemClickCallback(object : ListMovieAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Movie) {
                showSelectedMovie(data)
            }
        })
    }

    private fun showSelectedMovie(movie: Movie) {
        Toast.makeText(activity, "Kamu memilih " + movie.name, Toast.LENGTH_SHORT).show()
        val moveWithDataIntent = Intent(activity, DetailActivity::class.java)
        moveWithDataIntent.putExtra("ID", movie.id)
        moveWithDataIntent.putExtra("TYPE","MOVIE")
        startActivity(moveWithDataIntent)
    }

}