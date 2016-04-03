package com.kata.word.kata;

public class Wrapper {

	private static final String NEW_LINE = "\n";

	public String wrap(String text, int division) {
		if (text.length() > division) {
			int positionToSplit = division;
			int positionWithSpace = text.lastIndexOf(" ");
			if (positionWithSpace != -1) {
				positionToSplit = positionWithSpace;
			}
			return this.wrap(text.substring(0, positionToSplit),division) + NEW_LINE + text.substring(positionToSplit).trim();
		}
		return text;
	}

}
