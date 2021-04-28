package com.example.esperssouitestapp

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class MainActivity2Test {

    @Before
    fun setUp() {
    }

    @Test
    fun testMainActivity2TextViewVisibility(){
        val m= ActivityScenario.launch(MainActivity2::class.java)

        Espresso.onView(withId(R.id.tvDisplay1)).check(matches(isDisplayed()))
    }

    @After
    fun tearDown() {
    }
}