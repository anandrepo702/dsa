package com.dsa.learn.array;

public class MinMaxElement {

	public static void main(String[] args) {
		
		int arr[] = {90,5,50,20,30,80,40,10,4,100};
		findMInMax(arr);

	}
	
	private static void findMInMax(int arr[]) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int a : arr) {
			if(a < min) {
				min = a;
			}
			if(a > max) {
				max = a;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
