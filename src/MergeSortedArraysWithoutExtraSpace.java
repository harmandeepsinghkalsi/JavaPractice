import java.util.Arrays;

public class MergeSortedArraysWithoutExtraSpace {
	
public static void main(String[] args) {
		
		int arr1[] = {1,3,5,7};
		int arr2[] = {0,2,6,8,9};
		merge(arr1,arr2,4,5);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}
	
	public static void merge(int arr1[], int arr2[], int n, int m) {
        // code here
		int length1 = arr1.length;
        //int j = 0;
        
		
		for(int i =0;i<arr2.length;i++) {
			
			if(arr2[i]<arr1[length1-1-i]) {
				int temp = arr1[length1-1-i];
				arr1[length1-i-1]=arr2[i];
				arr2[i]=temp;
			} else {
				break;
			}
		}
//        while(i >= 0 && j < m){
//            
//            if(arr2[j] < arr1[i]){
//                int temp = arr1[i];
//                arr1[i]=arr2[j];
//                arr2[j]=temp;
//            }
//            i--;
//            j++;
//        }
        
        
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

}
