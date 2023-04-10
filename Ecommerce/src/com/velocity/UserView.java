package com.velocity;

import java.util.Scanner;

public class UserView {
	void getUserView() {
		System.out.print("Enter your Product ID >> ");
		Scanner scanner = new Scanner(System.in);
		int ProductId = scanner.nextInt();
		switch (ProductId) {
		case 101:

			System.out.print("Product Id: 101\n");
			System.out.println();
			System.out.print("Product Name: Laptop\n");
			System.out.println();
			System.out.print("Product Description: 4-8 GB RAM, 256-552 SSD\n");
			System.out.println();
			Laptop laptop = new Laptop();
			laptop.getLaptop();
			break;

		case 102:
			System.out.print("Product Id: 102\n");
			System.out.println();
			System.out.print("Product Name: Mobile Phones\n");
			System.out.println();

			MobilePhones mobilePhones = new MobilePhones();
			mobilePhones.getMobilePhones();

		}

	}

}
