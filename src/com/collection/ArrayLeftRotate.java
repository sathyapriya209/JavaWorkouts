package com.collection;

import java.util.Scanner;

public class ArrayLeftRotate {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int[] arr = new int[a];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		int temp;
		for(int i = 0; i < b; i++) {
			temp = arr[0];
			for(int j = 0; j < arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = temp;
		}
		
		for(int i : arr) {
			System.out.print(i);
			System.out.print(" ");
		}
		in.close();
	}

}
