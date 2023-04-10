package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ragistration {
	public void Register() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***Ragistration***");
		System.out.println();
		System.out.print("Enter the First name:");
		String fname = sc.next();
		System.out.println();
		System.out.print("Enter the Last Name:");
		String lname = sc.next();
		System.out.println();
		System.out.print("Enter the Username:");
		String uname = sc.next();
		System.out.println();
		System.out.print("Enter the Password:");
		String pass = sc.next();
		System.out.println();
		System.out.print("Enter the City:");
		String city = sc.next();
		System.out.println();
		System.out.print("Enter the Email:");
		String mail = sc.next();
		System.out.println();
		System.out.print("Enter the Mobile Number:");
		String mob = sc.next();
		System.out.println();

		Ragistration r = new Ragistration();
		r.getData(fname, lname, uname, pass, city, mail, mob);
		getConnection();
	}

	public Connection getConnection() {

		Connection con = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public void getData(String Firstname, String Lastname, String Username, String Password, String City, String Email,
			String MobileNumber) {

		Connection con2 = getConnection();
		PreparedStatement ps = null;

		try {

			ps = con2.prepareStatement(
					"insert into registrationdetails(Firstname,Lastname,Username,Password,City,Email,MobileNumber)values(?,?,?,?,?,?,?)");
			ps.setString(1, Firstname);
			ps.setString(2, Lastname);
			ps.setString(3, Username);
			ps.setString(4, Password);
			ps.setString(5, City);
			ps.setString(6, Email);
			ps.setString(7, MobileNumber);

			int a = ps.executeUpdate();

			System.out.println("Record Inserted Sucessfully!!! ");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
