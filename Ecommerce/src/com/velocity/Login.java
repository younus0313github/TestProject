package com.velocity;

import java.nio.channels.SelectableChannel;
import java.util.Scanner;

public class Login {

	public void getLoginDetails() {
		System.out.println("---Login---\n");
		Scanner sca = new Scanner(System.in);
		System.out.print("Enter the username:");
		String username = sca.next();
		System.out.println();
		System.out.print("Enter the password:");
		String password = sca.next();
		System.out.println();
		

		if (username == "Ram123") {
			if (password == "Ram@123") {
				System.out.println("Successfully Login...");
				
			}

		} else {
			System.out.println("Invalid username or password...");
		}

	}

}
