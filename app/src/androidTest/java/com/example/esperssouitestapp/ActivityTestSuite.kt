package com.example.esperssouitestapp

import org.junit.runner.RunWith
import org.junit.runners.Suite


@RunWith(Suite::class)
@Suite.SuiteClasses(
        MainActivityTest::class,
        MainActivity2Test::class
)
class ActivityTestSuite
