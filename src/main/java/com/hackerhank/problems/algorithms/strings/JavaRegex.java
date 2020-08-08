package com.hackerhank.problems.algorithms.strings;

public class JavaRegex {
	
	private static final String ZERO_TO_255
    = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";

	private static final String PATTERN
    	= ZERO_TO_255 + "\\." + ZERO_TO_255 + "\\." + ZERO_TO_255 + "\\." + ZERO_TO_255;	

	private JavaRegex() {
		throw new IllegalStateException("Utility class");
	}
	
	public static boolean matches(String ip) {
		return ip.matches(PATTERN);
	}
}
