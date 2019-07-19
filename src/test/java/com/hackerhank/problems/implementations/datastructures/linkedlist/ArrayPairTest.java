package com.hackerhank.problems.implementations.datastructures.linkedlist;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.hackerhank.problems.datastructures.tree.ArrayPair;

public class ArrayPairTest {

	@Test
	public void teste() throws IOException {
		int[] arr = {1, 1, 2, 4, 2};
		Assertions.assertEquals(8, ArrayPair.solve(arr));
	}
}
