package practice;

import java.io.IOException;
import java.util.Scanner;

public class RowWithMinNumOf1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// code

		Scanner sc = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		int t = sc.nextInt();
		// int t= Integer.parseInt(br.readLine());

		while (t-- > 0) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int arr[][] = new int [n][m];
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					
					arr[i][j]= sc.nextInt();
				}
			}
					
			//Logic
			int oneCount=0,minOneCount=Integer.MAX_VALUE,index=0;
			boolean allZero=true;
			for (int i = 0; i < n; i++) {
				oneCount=0;
				for (int j = 0; j < m; j++) {
					
					if(arr[i][j]==1){
						oneCount++;
						allZero=false;
					}
					else
						continue;
				}
				
				if(oneCount<minOneCount&&oneCount!=0){
					minOneCount=oneCount;
					index=i;
					
				}
			}
			
			
			if(allZero)
				System.out.println("-1");
			else{
				System.out.println(index);
			}


		}
	}

}
