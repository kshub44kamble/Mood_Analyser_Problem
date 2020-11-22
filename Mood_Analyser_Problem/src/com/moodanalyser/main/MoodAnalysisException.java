package com.moodanalyser.main;

public class MoodAnalysisException extends Exception {
	public enum ExceptionType {
		ENTERED_EMPTY, ENTERED_NULL;
	}

	private ExceptionType type;

	public ExceptionType getType() {
		return this.type = type;
	}

	MoodAnalysisException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}

	MoodAnalysisException(String message) {
		super(message);

	}
}
