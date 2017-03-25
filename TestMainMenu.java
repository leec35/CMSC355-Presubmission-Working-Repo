package com.example.clee9.cmsc355_doppleganger;

import android.content.Intent;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by clee9 on 3/24/2017.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class TestMainMenu
{
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void ButtonClick
    {
        onView(withId(R.id.CreditsButton)).check(ViewAssertions.matches(isClickable()));
        onView(withId(R.id.TakePhoto)).check(ViewAssertions.matches(isClickable()));
        onView(withId(R.id.PicDatabase)).check(ViewAssertions.matches(isClickable()));
    }

    @Rule
    public ActivityTestRule<TestMainMenu> rule = new ActivityTestRule(TestMainMenu.class, true, false);

    @Test
    public void TestPicDataBase
    {
        Intent intent = new Intent();
        intent.putExtra("EXTRA", "Test");
        rule.launchActivity(intent);
        onView(withId(R.id.PicDatabase)).check(matches(withText("Test"));
    }

    @Test
    public void TestCreditsPg
    {
        Intent intent = new Intent();
        intent.putExtra("EXTRA", "Test");
        rule.launchActivity(intent);
        onView(withId(R.id.CreditsButton)).check(matches(withText("Test")));
    }

    @Test
    public void TestPicButton
    {
        Intent intent = new Intent();
        intent.putExtra("Extra", "Test");
        rule.launchActivity(intent);
        onView(withId(R.id.TakePhoto)).check(matches(withText("Test")));
    }
}

