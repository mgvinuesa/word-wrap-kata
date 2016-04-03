package com.kata.word.kata;

public class Wrapper {

	private static final String NEW_LINE = "\n";

	public String wrap(String text, int division) {
		if (text.length() > division) {
			int positionToSplit = division;
			if (text.contains(" ")) {
				positionToSplit = text.lastIndexOf(" ");
			}
			return text.substring(0, positionToSplit) + NEW_LINE + text.substring(positionToSplit).trim();
		}
		return text;
	}

}
