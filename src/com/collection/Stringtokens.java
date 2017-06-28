package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Stringtokens {

	public static void main(String[] args) {
		// scan = new Scanner(System.in);
        //String s = scan.nextLine();
        String s = "He is a very very good boy, isn't he?";
        String[] s1 = s.split(" ");
        List<String> li = new ArrayList<String>();
        for(String s2 : s1){
        	String temp=s2.replaceAll(",","").replaceAll("?","").replaceAll("!", "").replaceAll("@", "").replaceAll("_", "").replaceAll("\\.", "");
        	if(temp.contains("'")){
        		String[] s3 =temp.split("'");
        		for(String s4 : s3){
        			li.add(s4);
        		}

        	} else {
        		li.add(temp);
        	}
        	}
        System.out.println(li.size());
        for(String str:li){
        	System.out.println(str);	
        }
        	
        //scan.close();
        
    
	}

}
