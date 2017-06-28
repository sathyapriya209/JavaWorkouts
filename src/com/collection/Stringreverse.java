package com.collection;

public class Stringreverse {

	public static void main(String[] args) {
		String A = "malialam";
		char[] ch = A.toCharArray();
		char[] ch1 = new char[A.length()];
		int j = 0;
		for (int i = A.length() - 1; i >= 0; i--) {
			ch1[j] = ch[i];
			j++;
		}
		String str2 = String.valueOf(ch1);
		if (A.equals(str2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
