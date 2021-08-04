package com.dsa.learn.sorting;

public class SelectionSort {

	public static void main(String args[]) {
		int arr[] = { 100, 20, 15, 30, 5, 75, 40 };
		sort(arr);
	}
	
	public static void sort(int arr[]) {
		for (int j = 0; j < arr.length; j++) {
			int minIndex = j;
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[i] < arr[minIndex])
					minIndex = i;
			} 
			if (minIndex != j) {
				int temp = arr[j];
				arr[j] = arr[minIndex];
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
