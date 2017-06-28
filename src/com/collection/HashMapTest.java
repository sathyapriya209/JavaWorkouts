package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Map<String, Integer> map1 = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			map1.put(name, phone);
			in.nextLine();
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			if(map1.containsKey(s)) {
				System.out.println(s+ "=" + map1.get(s));
			} else {
				System.out.println("Not found");
			}
				
		}
	}

}
 