package com.hackerhank.problems.algorithms.strings;

import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.hackerhank.problems.util.FileTestCaseUtil;

public class CamelCaseTest {
	
	@Test
	public void camelCaseTest() {
		String input = loadFileInput("input00.txt"); 
		int expected = loadFileOutput("output00.txt");

		int actual = CamelCase.camelcase(input);
		Assertions.assertEquals(expected, actual);
	}
	
	private static String loadFileInput(String fileName) {
		Scanner scanner = FileTestCaseUtil.getFileFromResources("CamelCaseTest/input/" + fileName);
		String input = scanner.nextLine();
		scanner.close();
		return input;
	}
	
	
	private static int loadFileOutput(String fileName) {
		Scanner scanner = FileTestCaseUtil.getFileFromResources("CamelCaseTest/output/" + fileName);		
		int output = scanner.nextInt();
		scanner.close();
		return output;
	}
}
