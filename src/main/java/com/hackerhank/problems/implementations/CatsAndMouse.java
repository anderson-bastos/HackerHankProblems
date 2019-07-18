package com.hackerhank.problems.implementations;

public class CatsAndMouse {
	
	private CatsAndMouse() {
		throw new IllegalStateException("Utility class");
	}
	
	public static final String CAT_A = "Cat A";
	public static final String CAT_B = "Cat B";
	public static final String MOUSE_C = "Mouse C";

    static String catAndMouse(int x, int y, int z) {
    	int distanceCatA = (z > x) ? z-x : x-z;
    	int distanceCatB = (y > z) ? y-z : z-y;
    	
    	if(distanceCatA > distanceCatB)
    		return CAT_B;
    	if(distanceCatA < distanceCatB)
    		return CAT_A;
        return MOUSE_C;
    }

}
