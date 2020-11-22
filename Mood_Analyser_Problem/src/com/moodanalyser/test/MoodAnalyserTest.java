package com.moodanalyser.test;

import org.junit.Assert;
import org.junit.Test;

import com.moodanalyser.main.MoodAnalyser;
import com.moodanalyser.main.MoodAnalysisException;

public class MoodAnalyserTest {
	String result = null;

	// TC 1.1 Given "I am in sad mood" message should return sad
	@Test
	public void givenMessage_WhenValid_ThenReturnMood() {
		MoodAnalyser mood = new MoodAnalyser("I am in sad mood");
		try {
			result = mood.moodAnalyser("sad");
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("sad", result);
	}

	// TC 1.2 Given "I am in any mood" message should return happy
	@Test
	public void givenMessage_WhenNotValid_ThenReturnMood() {
		MoodAnalyser mood = new MoodAnalyser("I am in any mood");
		try {
			result = mood.moodAnalyser("happy");
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("happy", result);
	}

	// TC 3.1 Given Null Should throw MoodAnalysisException
	@Test
	public void givenNull_WhenNull_ThenShouldThrowException() throws MoodAnalysisException {

		MoodAnalyser mood = new MoodAnalyser(null);
		try {
			result = mood.moodAnalyser("");
			Assert.assertEquals("happy", result);

		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.getType());
		}
	}

	// TC 3.2 Given Empty Should throw MoodAnalysisException
	@Test
	public void givenEmpty_WhenEmpty_ThenShouldThrowException() throws MoodAnalysisException {

		MoodAnalyser mood = new MoodAnalyser("");
		try {
			result = mood.moodAnalyser("");
			Assert.assertEquals("happy", result);

		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.getType());
		}
	}
}
