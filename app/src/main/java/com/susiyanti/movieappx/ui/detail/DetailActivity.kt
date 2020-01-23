package com.susiyanti.movieappx.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.susiyanti.movieappx.Movie
import com.susiyanti.movieappx.R
import com.susiyanti.movieappx.ui.movie.MovieViewModel
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val viewModel = ViewModelProviders.of(this).get(DetailViewModel::class.java)
        val type = intent.getStringExtra("TYPE")
        val m = intent.getIntExtra("ID",0)
        val movie:Movie
        if (type.equals("MOVIE")) {
            movie = viewModel.getMovie(m)
        } else {
            movie = viewModel.getTvShow(m)
        }

        txtName.text = movie.name
        txtDesc.text = movie.desc
        imgUrl.setImageResource(movie.photo)
    }
}
