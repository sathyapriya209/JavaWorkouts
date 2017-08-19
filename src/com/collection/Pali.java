package com.collection;

public class Pali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "malayalam";
		boolean status = false;
		char[] ch = str.toCharArray();
		int j=ch.length-1;
		for(int i = 0; i<=str.length()-1;){
			if(ch[i]==ch[j]){
				i++;
				j--;
				if(i==j ||(j-i) ==1){
					status = true; 
					break;
				}
			}
			else{
				status = false;
				break;
			}
		}
		if(status){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
			
		}
}
