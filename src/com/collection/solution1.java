package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class solution1 {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
        //String S = in.next();
        //int start = in.nextInt();
       // int end = in.nextInt();
       // char[] ch = S.toCharArray();
		int k = 100;
		String s = "fsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH";
		List<String> li = new ArrayList<String>();
		for(int i=0;i<s.length()-(k-1);i++){
			li.add(s.substring(i,k));
		}
		System.out.println(li);	
        Collections.sort(li);
        System.out.println(li.get(0)+ " " + li.get(li.size()-1));
        
	}

}
