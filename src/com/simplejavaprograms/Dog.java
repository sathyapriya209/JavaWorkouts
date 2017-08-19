package com.simplejavaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Dog extends Animal {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("sridhar", "sridhar");
		map.put("sathya", "sathya");
		
		Iterator<Map.Entry<String,String>> entry = map.entrySet().iterator();
		
		while(entry.hasNext()){
			Map.Entry<String,String> e = entry.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		for(Map.Entry<String,String> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		Iterator<String> set = map.keySet().iterator();
		while(set.hasNext()) {
			String ss = set.next();
			System.out.println(ss);
		}

		
		List<Animal> li = new ArrayList<Animal>();
		foo(li);
		String str = "123";
		try {
			int i = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void foo(List<? super Dog> li) {
		// TODO Auto-generated method stub
		
	}

}
