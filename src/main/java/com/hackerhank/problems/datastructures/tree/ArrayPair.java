package com.hackerhank.problems.datastructures.tree;

import java.util.Arrays;

public class ArrayPair {
	
	private ArrayPair() {
		throw new IllegalStateException("Utility class");
	}

	public static long solve(int[] arr) {
		int maxElements = arr.length;
		int totalElements = 0;

		for (int i = 0; i < maxElements - 1; i++) {
			for (int j = i + 1; j < maxElements; j++) {
				long maxArray = max(i, j, arr);
				long product = arr[i] * arr[j];
				if (product <= maxArray && i < j) {
					totalElements++;
				}
			}
		}
		return totalElements;
	}

	private static long max(int start, int end, int[] arr) {
		return Arrays.stream(arr, start, end + 1).reduce(Integer::max).getAsInt();
	}
}
