package com.susiyanti.movieappx

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import  androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test


class MovieTest {
    @get:Rule
    var activityRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun toDetailActivityTest(){
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,click()))
        onView(withId(R.id.txtName)).check(matches(isDisplayed()))
        onView(withId(R.id.txtName)).check(matches(withText("A star is born")))
    }
}