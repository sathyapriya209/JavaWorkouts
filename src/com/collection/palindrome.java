package com.collection;

public class palindrome {

	public static void main(String[] args) {
		String str = "malialam";
		char[] ch = str.toCharArray();
		int j = str.length() - 1;
		boolean ispalindrome = false;
		for (int i = 0; i < str.length();) {
			if (ch[i] == ch[j]) {
				i++;
				j--;
				if((ch.length % 2 == 0 && j-i == 1) || i == j) {
					ispalindrome = true; break;
				}
			} else {
				ispalindrome = false;
			}
		}
		if (ispalindrome) {
			System.out.println("Given string is a palindrome");
		} else {
			System.out.println("Given string is not a  palindrome");
		}

	}
}
