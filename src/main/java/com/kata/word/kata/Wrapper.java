package com.kata.word.kata;

public class Wrapper {

	private static final String NEW_LINE = "\n";

	public String wrap(String text, int division) {
		if (text.length() > division) {
			if (text.contains(" ")) {
				int lastSpacePosition = text.lastIndexOf(" ");
				return text.substring(0,lastSpacePosition) + NEW_LINE + text.substring(lastSpacePosition).trim();
			} else {
				return text.substring(0, division) + NEW_LINE + text.substring(division);
			}
		}
		return text;
	}

}
