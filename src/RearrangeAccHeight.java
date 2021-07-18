import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Rearrange person acc to height(h) and no of persons in front of it(k)
public class RearrangeAccHeight {
	
public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		int arr[][]= new int[][] {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
		
		System.out.println("Give array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][0]);
			System.out.print(arr[i][1]);
			System.out.println();
		}
		// Sorting based on the height(h) in desc order and if heights are same sort based on the persons
		// in front of that person (k) in asc order.
		Arrays.sort(arr, (x,y) -> x[0]==y[0] ?	x[1]-y[1]:y[0]-x[0]);
		System.out.println("============");

		System.out.println("Array after sorting ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][0]);
			System.out.print(arr[i][1]);
			System.out.println();
		}
		
		List<int[]> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			int k = arr[i][1];
			list.add(k,arr[i]);
		}
		
		arr = list.toArray(new int[arr.length][2]);
		System.out.println("============");
		System.out.println("After rearrangement");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][0]);
			System.out.print(arr[i][1]);
			System.out.println();
		}
	
	}
}
