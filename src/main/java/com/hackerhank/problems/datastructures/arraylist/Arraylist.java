package com.hackerhank.problems.datastructures.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<int[]> graph = new ArrayList<>(n);
        System.out.println(n);
        for (int i = 0; i <= n; i++) {        	
        	String[] arr = scanner.nextLine().split(" ");        	
			System.out.println("Primeiro elemento");
        	/*
			 * int[] arr = new int[arrItens.length]; for (int j = 0; j < arrItens.length;
			 * j++) { arr[j] = Integer.parseInt(arrItens[j]); } graph.add(arr);
			 */
		}
        scanner.close();       
	}
}
