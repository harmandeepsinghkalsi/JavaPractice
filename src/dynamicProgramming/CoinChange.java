package dynamicProgramming;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class CoinChange {
	
	public static void main(String args[]){
		 
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("This program is based on Coin Change Problem");
		 
		 System.out.println("Enter the total number of coins you have");
		 
		 int totalCoins = sc.nextInt();
		 
		 System.out.println("Enter the coin denominations you have");
		 
		 int coins[]= new int [totalCoins];
		 
		 for (int i = 0; i < coins.length; i++) {
			coins[i]=sc.nextInt();
		}
		 
		 
		
		 
		 	
		 
		 System.out.println("Enter the total amount you want to achieve from the coins ");
		 
		 int totalAmount = sc.nextInt();
		 
		 int result = countWays( coins , totalCoins , totalAmount);
		 
		 System.out.println(result);
	 }
	 
	 public static int countWays(int arr[],int tc , int ta)
	 {
		 
		 int totalWays = 0 ;
		 
		 int table [] = new int [ta+1];
		 
		 Arrays.fill(table,0);
		 
		 table[0]=1;
		
		for (int i = 0; i < tc; i++) {
			for (int j = arr[i]; j <= ta; j++) {
				table[j]=table[j]+table[j-arr[i]];
			}
		}
		 
		 
		 
		 return table[ta] ;
	 }
	 
	 

}
