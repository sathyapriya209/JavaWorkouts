package com.collection;

public class Array2d {

	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		arr[0][0] = 1;
		arr[0][1] = 1;
		arr[0][2] = 1;
		arr[1][1] = 1;
		arr[2][0] = 1;
		arr[2][1] = 1;
		arr[2][2] = 1;
		arr[3][2] = 2;
		arr[3][3] = 4;
		arr[3][4] = 4;
		arr[4][3] = 2;
		arr[5][2] = 1;
		arr[5][3] = 2;
		arr[5][4] = 4;
		//print2DArray(a);
		int global = 0;
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = 0; j <arr.length-2; j++) {
				 int temp = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				 if(temp > global) {
					 global = temp;
				 }
			}
		}
		System.out.println(global);
		

	}

	private static void print2DArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
