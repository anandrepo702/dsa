package com.dsa.learn.array;

public class CreateArray {

	public static void main(String[] args) {
		//We can declare and initialize an array in 3 types like below

		//Type1
		int arr1[] = new int[5];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		//Type2
		int arr2[] = new int[] {10,20,30,40,50};
		
		//Type3
		int arr3[] = {10,20,30,40,50};
		
		System.out.println(arr1[3]);
		System.out.println(arr2[3]);
		System.out.println(arr3[3]);
		
	}
}
