
public class ArrangeElementsAlternatively {
	
	public static void main(String[] args) {
		
	    int arr[] = {10,20,30,40,50,60,70,80,90,100,110};
	    
	    
	    int minPointer = 0;
	    int maxPointer = arr.length-1;
	    
	    while(minPointer < maxPointer-1){
	        System.out.print(arr[maxPointer]+" ");
	        System.out.print(arr[minPointer]+" ");
	        minPointer++;
	        maxPointer--;
	    }
	   
	   if(minPointer == maxPointer) {
		   System.out.print(arr[minPointer]); 
	   } else {
		   System.out.print(arr[maxPointer]+" ");
		   System.out.print(arr[minPointer]);
	   }
	   System.out.println(); 
}

}
