package com.example.esperssouitestapp

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {


    @Before
    fun setUp() {
    }

//    @Test
//    fun testUserInput(){
//
//        Espresso.onView(withId(R.id.etInput)).perform(typeText(name))
//        Espresso.onView(withId(R.id.etPassword)).perform(typeText(name))
//        Espresso.onView(withId(R.id.etEmail)).perform(typeText(name))
//        Espresso.closeSoftKeyboard()
//        Espresso.onView(withId(R.id.btClick)).perform(click())
//        Espresso.onView(withId(R.id.tvDisplay)).check(matches(withText(name+name+name)))
//
//    }

    @Test
    fun testMainActivityEditTextVisibility(){

        val m=ActivityScenario.launch(MainActivity::class.java)

        Espresso.onView(withId(R.id.etInput)).check(matches(isDisplayed()))
        Espresso.onView(withId(R.id.etPassword)).check(matches(isDisplayed()))
        Espresso.onView(withId(R.id.etEmail)).check(matches(isDisplayed()))
    }

    @Test
    fun testMainActivityButtonVisibility(){
        val m=ActivityScenario.launch(MainActivity::class.java)

        Espresso.onView(withId(R.id.btClick)).check(matches(isDisplayed()))
    }

    @Test
    fun testMainActivityTextViewVisibility(){
        val m=ActivityScenario.launch(MainActivity::class.java)

        Espresso.onView(withId(R.id.tvDisplay)).check(matches(isDisplayed()))
    }
    @Test
    fun testMainActivityButtonClickble(){
        val m=ActivityScenario.launch(MainActivity::class.java)

        Espresso.onView(withId(R.id.btClick)).check(matches(isClickable()))
    }

//    @Test
//    fun testMainActivity2TextViewVisibility(){
//        val m=ActivityScenario.launch(MainActivity2::class.java)
//
//        Espresso.onView(withId(R.id.tvDisplay1)).check(matches(isDisplayed()))
//    }

    @Test
    fun testNavigationOfnextActivityOnButtonClicked()
    {
        val m=ActivityScenario.launch(MainActivity::class.java)

        Espresso.onView(withId(R.id.btClick)).perform(click())
        Espresso.onView(withId(R.id.secondary)).check(matches(isDisplayed()))
    }

    @After
    fun tearDown() {

    }
}