package com.hackerhank.problems.algorithms.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.hackerhank.problems.util.FileTestCaseUtil;

public class JavaRegexTest {
	
	@Test
	public void javaRegexTestZero() {
		String[] input = loadFileInput("input00.txt"); 
		Boolean[] expected = loadFileOutput("output00.txt");
		casesTest(input, expected);
	}
	
	@Test
	public void javaRegexTestOne() {
		String[] input = loadFileInput("input01.txt"); 
		Boolean[] expected = loadFileOutput("output01.txt");
		casesTest(input, expected);
	}
	
	@Test
	public void javaRegexTestTwo() {
		String[] input = loadFileInput("input02.txt"); 
		Boolean[] expected = loadFileOutput("output02.txt");
		casesTest(input, expected);
	}

	private void casesTest(String[] input, Boolean[] expected) {
		for (int i = 0; i < expected.length; i++) {
			Assertions.assertEquals(expected[i], JavaRegex.matches(input[i]));			
		}
	}
	
	private static String[] loadFileInput(String fileName) {
		Scanner scanner = FileTestCaseUtil.getFileFromResources("JavaRegex/input/" + fileName);		
		List<String> ips =  new ArrayList<>();
        while(scanner.hasNext()){
            ips.add(scanner.next());            
        }
		scanner.close();
		return ips.stream().toArray(String[]::new);
	}
	
	
	private static Boolean[] loadFileOutput(String fileName) {
		Scanner scanner = FileTestCaseUtil.getFileFromResources("JavaRegex/output/" + fileName);
		List<Boolean> ips =  new ArrayList<>();
        while(scanner.hasNext()){
            ips.add(scanner.nextBoolean());            
        }
		scanner.close();
		return ips.stream().toArray(Boolean[]::new);
	}
}
