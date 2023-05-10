package com.GitPractice;

public class ReadString {
	public static void main(String[] args) {
		String str = "Welcome to India";
		for (int i = 0; i < str.length(); i++) {

			char ch=str.charAt(i);
			System.out.print(ch + "");
		}
		//System.err.println(str.length());
		
		
	}
}