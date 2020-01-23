package com.susiyanti.movieappx

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.susiyanti.movieappx.ui.detail.DetailActivity
import org.junit.Rule
import org.junit.Test

class DetailActivityTest {

    var dummyMovie = DataDummy.listMovie.get(0)

    @get:Rule
    var activityRule = object:ActivityTestRule<DetailActivity>(DetailActivity::class.java){
        override fun getActivityIntent(): Intent {
            val targetContext = InstrumentationRegistry.getInstrumentation().targetContext
            return Intent(targetContext, DetailActivity::class.java).putExtra("MOVIE", dummyMovie.id)
        }
    }

    @Test
    fun loadMovie(){
        onView(withId(R.id.txtName)).check(matches(isDisplayed()))
        onView(withId(R.id.txtName)).check(matches(withText(dummyMovie.name)))
        onView(withId(R.id.txtDesc)).check(matches(isDisplayed()))
        onView(withId(R.id.txtDesc)).check(matches(withText(dummyMovie.desc)))
    }

}