package com.hackerhank.problems.implementations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindDigitsTest {

	@Test
	public void findDigitsTest() {
		Assertions.assertEquals(2, FindDigits.findDigits(12));
		Assertions.assertEquals(3, FindDigits.findDigits(1230));
		Assertions.assertEquals(3, FindDigits.findDigits(123456789));
		Assertions.assertEquals(3, FindDigits.findDigits(114108089));
		Assertions.assertEquals(6, FindDigits.findDigits(110110015));
		Assertions.assertEquals(2, FindDigits.findDigits(121));
		Assertions.assertEquals(2, FindDigits.findDigits(33));
		Assertions.assertEquals(2, FindDigits.findDigits(44));
		Assertions.assertEquals(2, FindDigits.findDigits(33));
		Assertions.assertEquals(2, FindDigits.findDigits(55));
		Assertions.assertEquals(2, FindDigits.findDigits(66));
		Assertions.assertEquals(2, FindDigits.findDigits(77));
		Assertions.assertEquals(2, FindDigits.findDigits(88));
		Assertions.assertEquals(5, FindDigits.findDigits(106108048));
	}
}
