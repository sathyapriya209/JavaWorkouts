package com.ocjp;

public class Rainbow {

	public static void main(String[]...a) {
		int color = MyColor.GREEN.getRGB() + MyColor.BLUE.getRGB();
		System.out.println(color);
		dummy(new String[]{"sri"},new String[]{"sat"});

	}
	
	private static void dummy(String[]...a) {
		/*for(String d : a) {
			System.out.println(d);
		}*/
	}

}
