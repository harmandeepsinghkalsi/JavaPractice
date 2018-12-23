package dynamicProgramming;


//Longest Common Subsequence
/* Dynamic Programming Java implementation of LCS problem */


//This approach has complexity O(m*n) . This can be further more improved wrt space complexity by having only 2 rows at a time , 
//because result for next row is being calculated using previw row values.


public class LCS
{
 
  /* Returns length of LCS for X[0..m-1], Y[0..n-1] */
  void lcs( char[] X, char[] Y, int m, int n )
  {
    int L[][] = new int[m+1][n+1];
 
    /* Following steps build L[m+1][n+1] in bottom up fashion. Note
         that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
    for (int i=0; i<=m; i++)
    {
      for (int j=0; j<=n; j++)
      {
        if (i == 0 || j == 0)
            L[i][j] = 0;
        else if (X[i-1] == Y[j-1])
            L[i][j] = L[i-1][j-1] + 1;
        else
            L[i][j] = max(L[i-1][j], L[i][j-1]);
      }
    }
  //return L[m][n];
  
  
   int index = L[m][n];
   int temp = index;
   
   char[] lcs= new char[index+1];
  //lcs[index]='\0';
   
   int i =m,j=n;
   
   while(i>0&&j>0){
	   
	   if(X[i-1]==Y[j-1]){
		   lcs[index-1]=X[i-1];
		   
		   i--;
		   j--;
		   index--;
		   
	   }
	   else if(L[i-1][j]>L[i][j-1]){
		   i--;
		   
	   }else
		   j--;
	   
   }
   
   System.out.print("LCS of "+X+" and "+Y+" is ");
   for(int k=0;k<=temp;k++)
       System.out.print(lcs[k]);
  
  }
 
  /* Utility function to get max of 2 integers */
  int max(int a, int b)
  {
    return (a > b)? a : b;
  }
 
  public static void main(String[] args)
  {
    LCS lcs = new LCS();
    String s1 = "AGGTAB";
    String s2 = "GXTXAYB";
 
    char[] X=s1.toCharArray();
    char[] Y=s2.toCharArray();
    int m = X.length;
    int n = Y.length;
 
   
    lcs.lcs( X, Y, m, n );
  }
 
}