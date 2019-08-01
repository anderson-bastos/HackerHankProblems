package com.hackerhank.problems.implementations;

public class ElectronicShop {
	
	private ElectronicShop() {
		throw new IllegalStateException("Utility class");
	}

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int moneyEnough = -1;
		int keyboardsLength = keyboards.length;
		int drivesLength = drives.length;
		for (int i = 0; i < keyboardsLength; i++) {
			for (int j = 0; j < drivesLength; j++) {
				int sumProducts = keyboards[i] + drives[j];
				
				if(b == sumProducts)
					return b;
				if (b > sumProducts && sumProducts > moneyEnough)
					moneyEnough = sumProducts;
			}
		}
		return moneyEnough;
	}
}
