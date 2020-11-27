package com.example.quiz;


import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class StartingScreenActivityTest {

    @Rule
    public ActivityTestRule<StartingScreenActivity> mActivityTestRule = new ActivityTestRule<>(StartingScreenActivity.class);

    @Test
    public void startingScreenActivityTest() {
    }
}
