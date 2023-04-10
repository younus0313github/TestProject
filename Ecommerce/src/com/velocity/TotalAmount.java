package com.velocity;

import java.util.Scanner;

public class TotalAmount {
	public void getTotalAmount() {
		int TotalAmount = 0;
		System.out.print("Enter the Quantity of Product >> ");
		Scanner scanner = new Scanner(System.in);
		int quantity = scanner.nextInt();
		System.out.println();
		System.out.print("Enter the Amount >> ");
		int amount = scanner.nextInt();
		System.out.println();

		TotalAmount = quantity * amount;
		System.out.print("Total Amount is >> " + TotalAmount);

	}

}
