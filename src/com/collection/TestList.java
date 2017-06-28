package com.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestList {
	
	public static void main(String[] args) {
		
		List<String> li = new LinkedList<String>();
		li.add("sathya");
		li.add("sridhar");
		
		Iterator<String> it = li.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		System.out.println("---------------------------");
		for(String str : li) {
			System.out.println(str);
		}
	}

}
