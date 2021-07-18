import java.util.ArrayList;
import java.util.Scanner;

//class Query {
//	int l ;
//	int r;
//	int result;
//}

public class SumMatrix {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int n = 2;
			int m = 2;
			int a [][] = new int [n][m];
			a[0][0]=1;
			a[0][1]=4;
			a[1][0]=2;
			a[1][1]=5;
			int noOfQ = 2;
			int s = 2;
			int q[][] = new int[noOfQ][s];
			q[0][0]=3;
			q[0][1]=7;
			q[1][0]=3;
			q[1][1]=9;
			int result[] = new int[noOfQ];
			for (int i = 0; i< noOfQ; i++) {
					int l = q[i][0];
					int r = q[i][1];
					result[i]=sumMatrix(a,n,m,l,r);
			}
			
			for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]+" ");
			}
			
			
			//sumMatrix()
		}
		
		public static int sumMatrix(int a[][],int n, int m,int l ,int r ) {
			
			int colSum = 0;
			int rowSum=0;
			int totalCount = 0;
			
			// column sum
			for (int i = 0; i <n ; i++) {
				colSum=0;
				for (int j = 0; j < m; j++) {
					colSum+=a[i][j];
					if(colSum>r) {
						break;
					}
				}
				if(colSum>=l && colSum<=r) {
					totalCount+=1;
				}
			}
			
			//row sum
			for (int i = 0; i <m ; i++) {
				for (int j = 0; j < n; j++) {
					rowSum+=a[j][i];
				}
				if(rowSum>=l && rowSum<=r) {
					totalCount+=1;
				}
				rowSum=0;
			}
			
			return totalCount;
		}
}
