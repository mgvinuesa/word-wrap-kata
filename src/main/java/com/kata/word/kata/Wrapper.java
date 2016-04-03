package com.kata.word.kata;

public class Wrapper {

	public String wrap(String text, int division) {
		if (text.length() > division) {
			if (text.contains(" ")) {
				return text.replace(" ","\n");
			} else {
				return text.substring(0, division) + "\n" + text.substring(division);
			}
		}
		return text;
	}

}
