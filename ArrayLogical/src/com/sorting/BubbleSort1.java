package com.sorting;

public class BubbleSort1 {

	public static void main(String[] args) {
		
		int a[] = { 22, 11, 55, 99, 66, 44, 33 };

		bubbleSort(a);

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + ", ");

		}
	}

	static void bubbleSort(int arr[]) {

		int n = arr.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {

				if (arr[j - 1] > arr[j]) {
					// swapping

					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;

				}

			}

		}

	}

}
