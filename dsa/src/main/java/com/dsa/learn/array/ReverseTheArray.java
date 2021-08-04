package com.dsa.learn.array;

public class ReverseTheArray {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6,7};
		reverse(arr);

	}
	
	private static void reverse(int arr[]) {
		int start = 0;
		int end = arr.length-1;
		
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for(int a : arr) {
			System.out.println(a);
		}
		
	}

}
