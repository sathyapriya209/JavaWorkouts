package com.collection;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String a ="hello";
		String b ="hello";
		char[] ch =a.toLowerCase().toCharArray();
		char[] ch1 = b.toLowerCase().toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		a=String.valueOf(ch);
		b=String.valueOf(ch1);
		
		System.out.println(a + " " + b);
		if(a.equalsIgnoreCase(b)){
			System.out.println("Anagrams");
		}
		else{
			System.out.println("Not Anagrams");
		}
			
		
	}

}
