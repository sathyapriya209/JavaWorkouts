package com.collection;
import java.io.*;
import java.util.*;

public class solutionnew {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       // String A=sc.next();
       // String B=sc.next();
        String A ="hello";
        String B ="java";
        int len1 =A.length();
        int len2 = B.length();
        System.out.println(len1+len2);
        
       /* for(int i=0;i<A.length()-1;i++){
        	if(A.charAt(i)>B.charAt(i)){
        		System.out.println("Yes");
           	}
             else if(A.charAt(i)<B.charAt(i)){
        		System.out.println("No");
        		}
        		*/
        int result = A.compareTo(B);
        if(result>0)
        	System.out.println("Yes");
        else if(result<0)
        	System.out.println("No");
        else
        	System.out.println("equal");
        char[] ch = A.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        char[] ch2 = B.toCharArray();
        ch2[0] = Character.toUpperCase(ch2[0]);
        String s1=String.valueOf(ch);
        String s2=String.valueOf(ch2);
        System.out.println(s1 +" "+ s2);
        }
}       
        
    

