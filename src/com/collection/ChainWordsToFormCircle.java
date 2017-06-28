package com.collection;

public class ChainWordsToFormCircle {
	
	public static void main(String[] args) {
		String str[] = { "geek", "king", "gingy" };
		boolean isCircle = true;
		for (int i = 0; i < str.length; i++) {
			String str1 = str[i];
			String str2;
			if(i == str.length -1) {
				str2 = str[0];
			} else {
				str2 = str[i+1];
			}
			char ch = str1.charAt(str1.length()-1);
			char ch1 = str2.charAt(0);
			if(ch!=ch1)
			{
			  System.out.println("false"); break;
			}
		}
	
	}
}