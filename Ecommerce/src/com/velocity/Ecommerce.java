package com.velocity;

import java.security.interfaces.RSAKey;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthScrollBarUI;


public class Ecommerce {

	public static void main(String[] args) {

		System.out.println("Welcome to E-Commerce based application");
		System.out.println();
		System.out.println("1. User Registration");
		System.out.println("2. User Login");
		System.out.println("3. User view Product item as Sorted Order");
		System.out.println("4. Buy Product");
		System.out.println("5. View Cart");
		System.out.println("6. Purchase the item");
		System.out.println("7. Add product item");
		System.out.println("8. Calculate Bill");
		System.out.println("9. Display amount to End User");
		System.out.println("10.Check Quantity");
		System.out.println("11.Check registered user");
		System.out.println("12.Check the particular user history");
		System.out.println("13.View product item");
		System.out.println("14.Not purchase item");

		Ecommerce ecommerce = new Ecommerce();
		System.out.println();
		System.out.print("Enter your choice >> ");
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			Ragistration ragistration = new Ragistration();
			ragistration.Register();

			break;

		case 2:
			Login login = new Login();
			login.getLoginDetails();
			break;
		case 3:
			UserView userView = new UserView();
			userView.getUserView();
			break;

		case 4:
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the product id to buy produc:");
			String Pib = s1.next();
			System.out.println("Enter the quantity:");
			String q = s1.next();
			System.out.println("Do you want to view cart:");
			String vc = s1.next();

			break;

		case 5:
			Scanner s2 = new Scanner(System.in);
			System.out.println("Product item has been added to cart:");
			String ac = s2.next();

			break;

		case 6:

			Scanner s3 = new Scanner(System.in);
			System.out.println("Username:");
			String Un = s3.next();
			Bill bill1 = new Bill();
			bill1.getBill();

			break;

		case 7:

			Scanner s4 = new Scanner(System.in);
			System.out.println("Enter the Product Id:");
			String Prid = s4.next();
			System.out.println("Enter the Product Name:");
			String Pna = s4.next();
			System.out.println("Enter the Product Description:");
			String Pde = s4.next();
			System.out.println("Enter the Available Quantity:");
			String Aqa = s4.next();
			System.out.println("Enter the price:");
			String Pr = s4.next();

			break;

		case 8:

			Bill bill = new Bill();
			bill.getBill();

			break;

		case 9:
			System.out.println("---Total Amount--- ");
			System.out.println();
			TotalAmount totalAmount = new TotalAmount();
			totalAmount.getTotalAmount();

			break;

		case 10:

			Scanner s7 = new Scanner(System.in);
			System.out.println("Enter the Product Id:");
			String PId = s7.next();
			System.out.println("Enter the  Quantity:");
			String qu = s7.next();

			break;

		case 11:

			Scanner s8 = new Scanner(System.in);
			System.out.println("Enter the username:");
			String usname = s8.next();
			System.out.println("Enter the firstname:");
			String finame = s8.next();
			System.out.println("Enter the lastname:");
			String laname = s8.next();
			System.out.println("Enter the mail:");
			String email = s8.next();
			System.out.println("Enter the mobilenumber:");
			String mobi = s8.next();
			System.out.println("Enter the city:");
			String City = s8.next();

			break;

		case 12:

			Scanner s9 = new Scanner(System.in);
			System.out.println("Enter the user id:");
			String uid = s9.next();
			System.out.println("Enter the Product Id:");
			String prid = s9.next();
			System.out.println("Enter the Product Description:");
			String Produd = s9.next();
			System.out.println("Enter the  Quantity:");
			String qua = s9.next();

			break;

		case 13:
			System.out.println("To View Product Item's >> \n");
			System.out.println("Plese Select Choice No - 3");

			break;

		case 14:
			System.out.println("You have not Purchesed any Item....\n");

			break;
		default:
			Scanner scan = new Scanner(System.in);
			System.out.println("Invalid choice:");

			break;

		}

	}

}

