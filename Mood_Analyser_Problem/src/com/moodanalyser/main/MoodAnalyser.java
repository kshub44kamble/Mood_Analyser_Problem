package com.moodanalyser.main;

public class MoodAnalyser {

	private String message;

	// main method
	public static void main(String[] args) {
		System.out.println("Welcome to mood analyser");
	}

	// method to return mood throws custom exception
	public String moodAnalyser(String mood) throws MoodAnalysisException {
		try {
			if (message.length() == 0) {
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,
						"You Entered empty mood, Please enter proper mood");
			}
			if (message.contains("sad")) {
				return ("sad");
			} else if (message.contains("happy")) {
				return ("happy");
			}
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,
					"You Entered empty mood, Please enter proper mood");

		}

		return (mood);
	}

	// parameterized constructor
	public MoodAnalyser(String message) {

		this.message = message;
	}

}
