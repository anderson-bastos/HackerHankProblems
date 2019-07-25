package com.hackerhank.problems.implementations;

public class FindDigits {
	
	private FindDigits() {
		throw new IllegalStateException("Utility class");
	}

	public static int findDigits(int n) {
		int number = n;
		int totalNumbers = 0;
		while(number > 0) {
			int digit = number%10;			
			if(digit > 0 && n%digit == 0)
				totalNumbers++;			
			number = number/10;			
		}
		return totalNumbers;
    }
}
