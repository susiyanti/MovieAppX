package com.susiyanti.movieappx.ui.tvshow

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.susiyanti.movieappx.ListMovieAdapter
import com.susiyanti.movieappx.Movie
import com.susiyanti.movieappx.R
import com.susiyanti.movieappx.ui.detail.DetailActivity
import com.susiyanti.movieappx.ui.movie.MovieViewModel
import kotlinx.android.synthetic.main.fragment_movie.*

class TvShowFragment : Fragment() {

    private lateinit var tvShowViewModel: TvShowViewModel

    private var tvShows = arrayListOf<Movie>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_tvshow, container, false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        rv_movie.setHasFixedSize(true)
        tvShowViewModel = ViewModelProviders.of(this).get(TvShowViewModel::class.java)
        tvShows = tvShowViewModel.getTvShows()
        val movieAdapter = ListMovieAdapter(tvShows)
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
        moveWithDataIntent.putExtra("TYPE","TVSHOW")
        moveWithDataIntent.putExtra("ID", movie.id)
        startActivity(moveWithDataIntent)
    }
}