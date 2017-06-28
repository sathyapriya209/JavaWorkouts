package com.collection;

public class InPlaceTransformationOfString {

	public static void main(String[] args) {
		String str = "a1b2c3r4t5y6u7i8o9p2s3d4"; //abc12
		char[] ch = str.toCharArray();
		char[] ch2 = new char[ch.length + ch.length/2];
		for(int i =0; i < ch.length; i++) {
			ch2[i] = ch[i];
		}
		int j = 0;
		for(int i = 0; i < ch.length; i++) {
			if(i % 2 != 0) {
			   	char temp = ch2[i];
			   	ch2[ch.length + j] = temp;
			   	ch2[i] =  ' ';
			   	j++;
			 }
}         
 	char[] ch3 = new char[ch.length];
 	int x=0;
 	for(int i=0 ; i<ch2.length ;i++){
 		if(ch2[i] != ' ' && x < ch3.length){
 			ch3[x] = ch2[i];
 			x++;
 			
 		}
 	}
 	System.out.println(String.valueOf(ch3));		
        
	}

}
