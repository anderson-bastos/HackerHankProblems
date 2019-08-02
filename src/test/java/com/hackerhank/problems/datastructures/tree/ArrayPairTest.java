package com.hackerhank.problems.datastructures.tree;

import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.hackerhank.problems.util.FileTestCaseUtil;

@TestMethodOrder(OrderAnnotation.class)
public class ArrayPairTest {

	@Test
	@Order(0)
	public void solveTestZero() throws IOException {
		int[] input = loadFileInput("input00.txt");
		int expected = loadFileOutput("output00.txt");

		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(1)
	public void solveTestOne() throws IOException {
		int[] input = loadFileInput("input01.txt");
		int expected = loadFileOutput("output01.txt");

		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(2)
	public void solveTestTwo() throws IOException {
		int[] input = loadFileInput("input02.txt");
		int expected = loadFileOutput("output02.txt");

		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(3)
	public void solveTestThree() throws IOException {
		int[] input = loadFileInput("input03.txt");
		int expected = loadFileOutput("output03.txt");

		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(4)
	public void solveTestFour() throws IOException {
		int[] input = loadFileInput("input04.txt");
		int expected = loadFileOutput("output04.txt");

		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(5)
	public void solveTestFive() throws IOException {
		int[] input = loadFileInput("input05.txt");
		int expected = loadFileOutput("output05.txt");
		
		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(6)
	public void solveTestSix() throws IOException {
		int[] input = loadFileInput("input06.txt");
		int expected = loadFileOutput("output06.txt");
		
		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(7)
	public void solveTestSeven() throws IOException {
		int[] input = loadFileInput("input07.txt");
		int expected = loadFileOutput("output07.txt");
		
		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(8)
	public void solveTestEight() throws IOException {
		int[] input = loadFileInput("input08.txt");
		int expected = loadFileOutput("output08.txt");
		
		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(9)
	public void solveTestNine() throws IOException {
		int[] input = loadFileInput("input09.txt");
		int expected = loadFileOutput("output09.txt");
		
		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(10)
	public void solveTestTen() throws IOException {
		int[] input = loadFileInput("input10.txt");
		int expected = loadFileOutput("output10.txt");
		
		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(11)
	public void solveTestEleven() throws IOException {
		int[] input = loadFileInput("input11.txt");
		int expected = loadFileOutput("output11.txt");
		
		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(12)
	public void solveTestTwelve() throws IOException {
		int[] input = loadFileInput("input12.txt");
		int expected = loadFileOutput("output12.txt");
		
		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(13)
	public void solveTestThirteen() throws IOException {
		int[] input = loadFileInput("input13.txt");
		int expected = loadFileOutput("output13.txt");
		
		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(14)
	public void solveTestFourteen() throws IOException {
		int[] input = loadFileInput("input14.txt");
		int expected = loadFileOutput("output14.txt");
		
		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(15)
	public void solveTestFifteen() throws IOException {
		int[] input = loadFileInput("input15.txt");
		int expected = loadFileOutput("output15.txt");
		
		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(16)
	public void solveTestSixteen() throws IOException {
		int[] input = loadFileInput("input16.txt");
		int expected = loadFileOutput("output16.txt");
		
		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(17)
	public void solveTestSeventeen() throws IOException {
		int[] input = loadFileInput("input17.txt");
		int expected = loadFileOutput("output17.txt");
		
		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(18)
	public void solveTestEightteen() throws IOException {
		int[] input = loadFileInput("input18.txt");
		int expected = loadFileOutput("output18.txt");
		
		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	@Test
	@Order(19)
	public void solveTestNineteen() throws IOException {
		int[] input = loadFileInput("input19.txt");
		int expected = loadFileOutput("output19.txt");
		
		performanceTest(input);
		Assertions.assertEquals(expected, ArrayPair.solve(input));
	}

	private void performanceTest(int[] input) {
		// Half second
		Assertions.assertTimeoutPreemptively(Duration.ofMillis(500), () -> {
			ArrayPair.solve(input);
		});
	}

	private static int[] loadFileInput(String fileName) {
		Scanner scanner = FileTestCaseUtil.getFileFromResources("ArrayPair/input/" + fileName);
		int arrCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[arrCount];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < arrCount; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}
		scanner.close();
		return arr;
	}

	private static int loadFileOutput(String fileName) {
		Scanner scanner = FileTestCaseUtil.getFileFromResources("ArrayPair/output/" + fileName);
		int output = scanner.nextInt();
		scanner.close();
		return output;
	}
}
