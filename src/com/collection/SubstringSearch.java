package com.collection;

public class SubstringSearch {

	public static void main(String[] args) {
		String str = "abcxabcdabcdabcy";
		String subString = "xab"; // "abcdabcy";
		char[] ch = str.toCharArray();
		char[] ch1 = subString.toCharArray();
		int j = 0;
		boolean isFound = false;
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == ch1[j]) {
				j++;
			} else {
				j = 0;
			}
			if(j==ch1.length){
				isFound = true;
				break;
		    }
		} 
		if(isFound) {
			System.out.println("substring found");
		} else {
			System.out.println("substring not found");
		}

}
}