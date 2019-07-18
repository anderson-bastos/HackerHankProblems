package com.hackerhank.problems.implementations;

import java.util.function.BinaryOperator;

public class CatsAndMouse {
	
	private CatsAndMouse() {
		throw new IllegalStateException("Utility class");
	}
	
	public static final String CAT_A = "Cat A";
	public static final String CAT_B = "Cat B";
	public static final String MOUSE_C = "Mouse C";
	
    static String catAndMouse(int x, int y, int z) {    	
    	int distanceCatA = calculateDistance().apply(x, z);
    	int distanceCatB =  calculateDistance().apply(y, z);
    	
    	if(distanceCatA > distanceCatB)
    		return CAT_B;
    	if(distanceCatA < distanceCatB)
    		return CAT_A;
        return MOUSE_C;
    }

	private static BinaryOperator<Integer> calculateDistance() {
		return (x, y) -> (y > x) ? y-x : x-y;
	}
}
