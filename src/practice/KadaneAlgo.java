package practice;

import java.io.*;

public class KadaneAlgo  //Simple idea of the Kadane's algorithm is to look for all positive contiguous segments of the array (max_ending_here is used for this). 
							//And keep track of maximum sum contiguous segment among all positive segments (max_so_far is used for this).
							//Each time we get a positive sum compare it with max_so_far and update max_so_far if it is greater than max_so_far

{
		public static void main(String args[])throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter no. of array elements");
			int n =Integer.parseInt(br.readLine());
			
			int arr[]=new int[n];
			for (int i = 0; i < n; i++) {
				arr[i]=Integer.parseInt(br.readLine());
			}
			
			int curr_sum  = arr[0];
			int global_sum=arr[0];
			for (int i = 1; i < arr.length; i++) {
				curr_sum+=arr[i];
				
				if(curr_sum<arr[i])
				{
					curr_sum=arr[i];
				}
				if(curr_sum>global_sum)
				{
					global_sum=curr_sum;
				}
			}
			System.out.println("First Approach ---- Maximum Sum is ->" +global_sum);
			
			
			
			//  Above program can be optimized further, if we compare max_so_far with max_ending_here only if max_ending_here is greater than 0.
			
			
			int max_so_far = 0, max_ending_here = 0;
			   for (int i = 0; i < arr.length; i++)
			   {
			       max_ending_here +=  arr[i];
			       if (max_ending_here < 0)
			           max_ending_here = 0;
			 
			       /* Do not compare for all elements. Compare only   
			          when  max_ending_here > 0 */
			       else if (max_so_far < max_ending_here)
			           max_so_far = max_ending_here;
			   }
			   System.out.println("Second Approach ---- Maximum Sum is ->" +max_so_far);
			   
			   
			   
			   
			 //Approach for tracking start and end index.  
			    max_so_far = 0; max_ending_here = 0;
				      int start =0, end = 0, s=0;
				 
				    for (int i=0; i< arr.length; i++ )
				    {
				        max_ending_here += arr[i];
				 
				        if (max_so_far < max_ending_here)
				        {
				            max_so_far = max_ending_here;
				            start = s;
				            end = i;
				        }
				 
				        if (max_ending_here < 0)
				        {
				            max_ending_here = 0;
				            s = i+1;
				        }
				    }
				   System.out.println("Maximum Sum is"+ max_so_far);
				   System.out.println("Start Index is ---- "+ start+ "  and Ending Index is ---- "+ end);
				}
		}
		
		
		
		
		

