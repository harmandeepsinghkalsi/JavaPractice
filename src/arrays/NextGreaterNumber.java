package arrays;

import java.util.Scanner;

public class NextGreaterNumber {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    
		    for(int i=0;i<n;i++){
		        int j=i+1; boolean found = false;
		        for(j=i+1;j<n;j++){
		            if(arr[j]>arr[i]){
		                System.out.print(arr[j]+" ");
		                found= true;
		                break;
		            }
		        }
		        
		        if(!found){
		            
		            if(j==arr.length)
		            System.out.print("-1"+ " ");
		        }
		        
		    }
		    System.out.println();
		}
	}

}