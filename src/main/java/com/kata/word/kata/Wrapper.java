package com.kata.word.kata;

public class Wrapper {

	public String wrap(String text, int division) {
		if(text.length() > division){
			return text.substring(0,division)+ "\n"  + text.substring(division);
		}
		return text;
	}

}
