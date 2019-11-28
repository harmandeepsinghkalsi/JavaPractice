package dataStructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
		
    	 Test mxdif = new Test(); 
         int arr[] = {80, 2, 6, 3, 100}; 
         int size = arr.length; 
         System.out.println(mxdif.maxDiff(arr, size));
         
         ArrayList<Integer> al = new ArrayList<>();
         al.add(1);
         al.add(2);
         al.add(3);
         al.add(4);
         Collections.rotate(al,-2);
         System.out.println(al);
	}
    
    
    int maxDiff(int arr[], int n)  
    { 
    	int max_diff = arr[1] - arr[0]; 
        int min_element = arr[0]; 
        int i; 
        for (i = 1; i < n; i++)  
        { 
            if (arr[i] - min_element > max_diff) 
                max_diff = arr[i] - min_element; 
            if (arr[i] < min_element) 
                min_element = arr[i]; 
        } 
        return max_diff; 

}
    
}

