package com.dsa.learn.sorting;

public class SelectionSort {

	public static void main(String args[]) {
		int arr[] = { 100, 20, 15, 30, 5, 75, 40 };
		sort(arr);
	}
	
	public static void sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex])
					minIndex = j;
			} 
			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		} 
		printArray(arr);
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
