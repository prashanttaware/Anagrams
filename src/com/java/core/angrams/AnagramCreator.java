package com.java.core.angrams;

import java.util.ArrayList;
import java.util.List;

public class AnagramCreator {

	@SuppressWarnings("serial")
	public ArrayList<String> generate(final String input) {
		if (input.length() <= 1) {
			return new ArrayList<String>() {
				{
					add(input);
				}
			};
		}
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < input.length(); i++) {
			String first = input.substring(i, i + 1);
			String second = convertData(input, i);
			for(String last : generate(second)) {
				result.add(first + last);
			}
		}
		return result;
	}

	private String convertData(String input, int round) {
		String result1 = input.substring(0, round);
		String result2 = input.substring(round + 1, input.length());
		return result1 + result2;
	}
}