package com.susiyanti.movieappx

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.NoMatchingViewException
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.matcher.ViewMatchers.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.Assert

class RecyclerViewItemCountAssertion(val expectedCount: Int) : ViewAssertion {

    override fun check(view: View?, noViewFoundException: NoMatchingViewException?) {
        if(noViewFoundException!=null){
            throw noViewFoundException
        }

        val rv = view as RecyclerView
        val adapter = rv.adapter
        Assert.assertNotNull(adapter)

        assertThat(adapter?.itemCount, `is`(expectedCount))

    }
}