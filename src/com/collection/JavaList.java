package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n ; i++){
        	li.add(in.nextInt());
        }
        int temp =in.nextInt();
		for (int i = 0; i < temp; i++) {
			String cmd = in.next();
			if (cmd.equals("Insert")) {
				int a = in.nextInt();
				int b = in.nextInt();
				li.add(a, b);
			} else {
				int a = in.nextInt();
				li.remove(a);
			}
		}	
		for(int a : li) {
			System.out.print(a);
			System.out.print(" ");
		}
		in.close();
	}
}
