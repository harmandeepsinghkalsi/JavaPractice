package practice.SortingAlgorithms;

import java.util.Scanner;

public class QuickSort {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		quickSort(arr, 0, arr.length - 1);
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

	public static void quickSort(int[] arr, int start, int end) {

		if (start < end) {
			int pIndex = partition(arr, start, end);
			quickSort(arr, start, pIndex - 1);
			quickSort(arr, pIndex + 1, end);
		}
	}

	public static int partition(int arr[], int start, int end) {

		int pivot = arr[end];
		int pIndex = start;

		for (int i = start; i < end; i++) {

			if (arr[i] <= pivot) {
				int temp = arr[pIndex];
				arr[pIndex] = arr[i];
				arr[i] = temp;
				pIndex++;
			}

		}

		int temp =arr[end];
		arr[end]=arr[pIndex];
		arr[pIndex]=temp;
		return pIndex;

	}

}
