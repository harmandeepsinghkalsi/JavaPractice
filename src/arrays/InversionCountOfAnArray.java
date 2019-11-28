package arrays;

import java.util.Scanner;

public class InversionCountOfAnArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();

			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			// int inversionCount =0;
			// for (int i = 0; i < n-1; i++) {
			// for (int j = i+1;j<n ; j++) {
			// if(arr[i]>arr[j]) {
			// inversionCount++;
			// }
			// }
			// }
			// System.out.println(inversionCount);

			System.out.println(mergeSort(arr, arr.length));
		}

	}

	// merge sort approach
	public static long mergeSort(int arr[], int n) {

		int resultantArray[] = new int[n];
		return _mergeSort(arr, resultantArray, 0, n - 1);
	}

	public static long _mergeSort(int arr[], int temp[], int left, int right) {

		int mid;
		long inversionCount = 0;
		if (left < right) {

			mid = (left + right) / 2;
			inversionCount = _mergeSort(arr, temp, left, mid);
			inversionCount += _mergeSort(arr, temp, mid + 1, right);

			inversionCount += merge(arr, temp, left, mid , right);

		}

		return inversionCount;
	}

	public static long merge(int arr[], int temp[], int left, int mid, int right) {

//		int i = left;
//		int j = mid;
//		int k = left;
//		int count = 0;
//		while ((i <= mid - 1) && (j <= right)) {
//			if (arr[i] > arr[j]) {
//				temp[k++] = arr[j++];
//				count = count + (mid - i);
//			} else {
//				temp[k++] = arr[i++];
//			}
//
//		}
//
//		while (i <= mid - 1) {
//			temp[k++] = arr[i++];
//		}
//
//		while (j <= right) {
//			temp[k++] = arr[j++];
//		}
//
//		for (i = left; i <= right; i++)
//			arr[i] = temp[i];
//
//		return count;
		
		
		long inv_count = 0;
	    int n = mid-left+1;
	   int  m = right-mid;
	    int a[] = new int[n];
	    int b[]= new int[m],i,j,k;
	    for(i=0;i<n;i++)
	        a[i] = arr[left+i];
	    for(j=0;j<m;j++)
	        b[j] = arr[mid+1+j];
	    i=0;j=0;k=left;
	    while(i<n && j<m){
	        if(a[i]<=b[j])
	            arr[k++] = a[i++];
	        else{
	            arr[k++] = b[j++];
	            inv_count += n-i;
	        }
	    }
	    while(i<n)
	        arr[k++] = a[i++];
	    while(j<m)
	        arr[k++] = b[j++];
	    return inv_count;
	}
}
