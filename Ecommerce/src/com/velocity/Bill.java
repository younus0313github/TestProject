package com.velocity;

import java.util.Scanner;

public class Bill {
	public void getBill() {
		int TotalBill = 0;
		System.out.print("Enter the Quantity of Product >> ");
		Scanner scanner = new Scanner(System.in);
		int quantity = scanner.nextInt();
		System.out.println();
		System.out.print("Enter the Amount >> ");
		int amount = scanner.nextInt();
		System.out.println();

		TotalBill = quantity * amount;
		System.out.print("Total Bill is >> " + TotalBill);
	}

}
