package com.dsa.learn.sorting;

public class BubbleSort {
	public static void main(String args[]) {
		int arr[] = { 100, 20, 15, 30, 5, 75, 40 };
		sort(arr);
	}

	public static void sort(int arr[]) {
		for(int i = 0; i<arr.length ; i++) {
			for(int j = 0; j < arr.length-1-i ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			printArray(arr);
		}
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
