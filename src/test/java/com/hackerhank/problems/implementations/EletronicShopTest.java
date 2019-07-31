package com.hackerhank.problems.implementations;

import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.hackerhank.problems.util.FileTestCaseUtil;

@TestMethodOrder(OrderAnnotation.class)
public class EletronicShopTest {
	
	private int b;
	private int n;
	private int m;
	private int[] keyboards;
	private int[] drives;
	
	private void loadFile(String fileName) {
		Scanner scanner = FileTestCaseUtil.getFileFromResources("EletronicShopTest/" + fileName);		
		loadHead(scanner);        
        loadKeyboardItens(scanner);
        loadMouseItens(scanner);
        scanner.close();
	}

	private void loadHead(Scanner scanner) {
		String[] bnm = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
        b = Integer.parseInt(bnm[0]);
        n = Integer.parseInt(bnm[1]);
        m = Integer.parseInt(bnm[2]);
	}

	private void loadMouseItens(Scanner scanner) {
		drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }
	}

	private void loadKeyboardItens(Scanner scanner) {
		keyboards = new int[n];
        String[] keyboardsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }
	}
	
	@Test
	@Order(1)
	public void getMoneySpentTestCaseZero() {
		loadFile("input00.txt");
        Assertions.assertEquals(9, ElectronicShop.getMoneySpent(keyboards, drives, b));		
	}
	
	@Test
	@Order(2)
	public void getMoneySpentTestCaseOne() {
		loadFile("input01.txt");
        Assertions.assertEquals(-1, ElectronicShop.getMoneySpent(keyboards, drives, b));		
	}
	
	@Test
	@Order(3)
	public void getMoneySpentTestCaseTwo() {
		loadFile("input02.txt");
        Assertions.assertEquals(374625, ElectronicShop.getMoneySpent(keyboards, drives, b));		
	}
	
	@Test
	@Order(4)
	public void getMoneySpentTestCaseThree() {
		loadFile("input03.txt");
        Assertions.assertEquals(-1, ElectronicShop.getMoneySpent(keyboards, drives, b));		
	}
	
	@Test
	@Order(5)
	public void getMoneySpentTestCaseFour() {
		loadFile("input04.txt");
        Assertions.assertEquals(539854, ElectronicShop.getMoneySpent(keyboards, drives, b));		
	}
	
	@Test
	@Order(6)
	public void getMoneySpentTestCaseFive() {
		loadFile("input05.txt");
        Assertions.assertEquals(142342, ElectronicShop.getMoneySpent(keyboards, drives, b));		
	}
	
	@Test
	@Order(7)
	public void getMoneySpentTestCaseSix() {
		loadFile("input06.txt");
        Assertions.assertEquals(-1, ElectronicShop.getMoneySpent(keyboards, drives, b));		
	}
	
	@Test
	@Order(8)
	public void getMoneySpentTestCaseSeven() {
		loadFile("input07.txt");
        Assertions.assertEquals(938168, ElectronicShop.getMoneySpent(keyboards, drives, b));		
	}
	
	@Test
	@Order(9)
	public void getMoneySpentTestCaseEight() {
		loadFile("input08.txt");
        Assertions.assertEquals(622830, ElectronicShop.getMoneySpent(keyboards, drives, b));		
	}
	
	@Test	
	@Order(10)
	public void getMoneySpentTestCaseNine() {
		loadFile("input09.txt");
        Assertions.assertEquals(-1, ElectronicShop.getMoneySpent(keyboards, drives, b));		
	}
	
	@Test
	@Order(11)
	public void getMoneySpentTestCaseTen() {
		loadFile("input10.txt");
        Assertions.assertEquals(9846, ElectronicShop.getMoneySpent(keyboards, drives, b));		
	}
	
	@Test
	@Order(12)
	public void getMoneySpentTestCaseEleven() {
		loadFile("input11.txt");
        Assertions.assertEquals(774746, ElectronicShop.getMoneySpent(keyboards, drives, b));		
	}
	
	@Test
	@Order(13)
	public void getMoneySpentTestCaseTwelve() {
		loadFile("input12.txt");
        Assertions.assertEquals(-1, ElectronicShop.getMoneySpent(keyboards, drives, b));		
	}
	
	@Test
	@Order(14)
	public void getMoneySpentTestCaseThirteen() {
		loadFile("input13.txt");
        Assertions.assertEquals(208837, ElectronicShop.getMoneySpent(keyboards, drives, b));		
	}
	
	@Test
	@Order(15)
	public void getMoneySpentTestCaseFourteen() {
		loadFile("input14.txt");
        Assertions.assertEquals(729580, ElectronicShop.getMoneySpent(keyboards, drives, b));		
	}
	
	@Test
	@Order(16)
	public void getMoneySpentTestCaseFifteen() {
		loadFile("input15.txt");
        Assertions.assertEquals(-1, ElectronicShop.getMoneySpent(keyboards, drives, b));		
	}
}
