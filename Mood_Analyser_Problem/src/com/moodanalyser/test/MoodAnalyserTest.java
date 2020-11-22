package com.moodanalyser.test;

import org.junit.Assert;
import org.junit.Test;

import com.moodanalyser.main.MoodAnalyser;

public class MoodAnalyserTest {

	// TC 1.1 Given "I am in sad mood" message should return sad
	@Test
	public void givenMessage_WhenValid_ThenReturnMood() {
		MoodAnalyser mood = new MoodAnalyser("I am in sad mood");
		String result = mood.moodAnalyser("sad");
		Assert.assertEquals("sad", result);
	}

	// TC 1.1 Given "I am in any mood" message should return happy
	@Test
	public void givenMessage_WhenNotValid_ThenReturnMood() {
		MoodAnalyser mood = new MoodAnalyser("I am in any mood");
		String result = mood.moodAnalyser("happy");
		Assert.assertEquals("happy", result);
	}

	// TC 2.1 Given null mood should return happy
	@Test
	public void givenNullMood_ShouldReturnHappy() {
		MoodAnalyser mood = new MoodAnalyser(null);
		String result = mood.moodAnalyser("");
		Assert.assertEquals("happy", result);
	}

}
