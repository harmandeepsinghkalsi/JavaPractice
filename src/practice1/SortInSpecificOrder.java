package practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


// Sort array in which odd numbers come first ordered in des manner , then come even number ordered in asc manner
public class SortInSpecificOrder {

	public static void main(String[] args) throws IOException, NumberFormatException {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt();
			
			int arr[] = new int[n];
			
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextInt();
			}
			
			List<Integer> oddList = new ArrayList<>();
			List<Integer> evenList = new ArrayList<>();

			for (int i = 0; i < arr.length; i++) {
				if(arr[i]%2==0) {
					evenList.add(arr[i]);
				}else {
					oddList.add(arr[i]);
				}
			}
			
			Collections.sort(evenList);
			Collections.sort(oddList,Comparator.reverseOrder());
			
			oddList.addAll(evenList);
			
			for (int i = 0; i < oddList.size(); i++) {
				System.out.print(oddList.get(i)+ " ");
			}
			System.out.println();
		}
	}
}

// Other ways :
/*
 * this works if all the numbers are positive
 * 1. Make all the odd numbers as negative 
 * 2. Sort the array
 * 3. Make the odd numbers positive.
 * 
 * Other method:
 * 
 * 1. Input the array elements.
2. Sort the array using sort() function.
3. Put i=N-1;
4. Print out the odd elements until i=0.
5. Put i=0;
6. Now print out the even elements until i=N-1.
Time complexity:
Step 2 should be O(NlogN).
Step 3 and Step 4 O(N) time.
Space complexity: O(1).


Third way :

	static void twoWaySort(Integer arr[], int n) 
    { 
        // Current indexes from left and right 
        int l = 0, r = n-1; 
       
        // Count of odd numbers 
        int k = 0; 
       
        while (l < r) 
        { 
            // Find first odd number from left side. 
            while (arr[l]%2 != 0) 
            { 
                l++; 
                k++; 
            } 
       
            // Find first even number from right side. 
            while (arr[r]%2 == 0  && l<r) 
                r--; 
       
            // Swap odd number present on left and even 
            // number right. 
            if (l < r) 
            { 
                //  swap arr[l] arr[r] 
                int temp = arr[l]; 
                arr[l] = arr[r]; 
                arr[r] = temp; 
                  
            } 
                 
        } 
       
        // Sort odd number in descending order 
        Arrays.sort(arr, 0, k,Collections.reverseOrder()); 
       
        // Sort even number in ascending order 
        Arrays.sort(arr, k, n); 
    }
 */
