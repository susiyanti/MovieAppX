package com.susiyanti.movieappx

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    var id: Int,
    var name: String,
    var desc: String,
    var photo: Int
): Parcelable