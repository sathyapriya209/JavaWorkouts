package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		List<List<Integer>> li = new ArrayList<>();
		Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        for(int i = 0; i < start; i++) {
        	List<Integer> li1 = new ArrayList<Integer>();
        	int temp = in.nextInt();
        	for(int j = 0; j < temp; j++) {
        		li1.add(in.nextInt());
        	}
        	li.add(li1);
        }
        int temp = in.nextInt();
        for(int i = 0; i < temp; i++) {
        	int a = in.nextInt();
        	int b = in.nextInt();
        	try {
				System.out.println(li.get(a-1).get(b-1));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
        }
		
	}
}
