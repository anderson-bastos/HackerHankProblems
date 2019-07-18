package com.hackerhank.problems.implementations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatsAndMouseTest {

	@Test
	public void catAndMouseTest() {
		Assertions.assertEquals(CatsAndMouse.MOUSE_C, CatsAndMouse.catAndMouse(3, 1, 2));
		Assertions.assertEquals(CatsAndMouse.CAT_A, CatsAndMouse.catAndMouse(2, 1, 2));
		Assertions.assertEquals(CatsAndMouse.CAT_B, CatsAndMouse.catAndMouse(1, 2, 3));
		Assertions.assertEquals(CatsAndMouse.CAT_B, CatsAndMouse.catAndMouse(1, 2, 2));
		Assertions.assertEquals(CatsAndMouse.MOUSE_C, CatsAndMouse.catAndMouse(1, 3, 2));
		Assertions.assertEquals(CatsAndMouse.MOUSE_C, CatsAndMouse.catAndMouse(3, 1, 2));
	}
}
