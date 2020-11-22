package com.moodanalyser.main;

public class MoodAnalyser {

	private String message;

	// main method
	public static void main(String[] args) {
		System.out.println("Welcome to mood analyser");
	}

	// method to return mood happy or sad
	public String moodAnalyser(String mood) {
		if (message.contains("sad")) {
			return ("sad");
		} else if (message.contains("Any")) {
			return ("happy");
		}
		return (mood);
	}

	public MoodAnalyser(String message) {

		this.message = message;
	}

}
