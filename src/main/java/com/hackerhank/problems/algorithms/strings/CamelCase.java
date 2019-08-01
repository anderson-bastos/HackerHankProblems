package com.hackerhank.problems.algorithms.strings;

public class CamelCase {
	
	private CamelCase() {
		throw new IllegalStateException("Utility class");
	}
	
	static int camelcase(String s) {	
		char[] test = s.toCharArray();
		int count = 1;
		for (int i = 0; i < test.length; i++) {
			if(Character.isUpperCase(test[i]))
					count++;
		}
		return count;
    }
}
