package com.collection;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 9, 6 };
		for (int j : arr) {
			System.out.println(j);
		}
		// Rotate array here.
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i != 0) {
				if(i == arr.length - 1) {
					arr[0] = temp;
					break;
				}
				int temp2 = temp;
				temp = arr[i + 1];
				arr[i + 1] = temp2;
			} else {
				temp = arr[i + 1];
				arr[i + 1] = arr[i];
			}
		}

	}

}
