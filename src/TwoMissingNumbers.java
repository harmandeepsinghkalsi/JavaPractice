package practice;

import java.util.Arrays;

// Array of nums from 1 to n are given and two numbers are missing.
public class TwoMissingNumbers {

    public static void main(String[] args) {

        int arr[] = {1,3,6,4}; //2 and 5 are missing
        int n = arr.length+2;
        int actualSum = (n*(n+1))/2; //21
        int currSum = Arrays.stream(arr).sum(); //14

        int sumOfMissingNums = actualSum-currSum; //7

        //One of the numbers should be less than or equal to avg and other should be greater than avg
        int avgMissingNums = sumOfMissingNums/2; //3

        //Take the avg and trdy to do the same with it

        int sumOfAvgNums = (avgMissingNums*(avgMissingNums+1))/2; //6
        int sumOfNumPresentEqualToOrElseThanAvgSum  = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=avgMissingNums){
                sumOfNumPresentEqualToOrElseThanAvgSum+=arr[i];
            }
        }

        int firstNum = sumOfAvgNums-sumOfNumPresentEqualToOrElseThanAvgSum; //2


        int secondNum = sumOfMissingNums-firstNum;

        System.out.println(firstNum);
        System.out.println(secondNum);

        missingNumsXOR(arr);

    }

    // Method to solve using XOR
     public static void missingNumsXOR(int[] arr){

        // xor of a and a is 0 , xor of a with 0 is a, xor of distinct number is 1
         int n = arr.length+2;// actual length

         int xorMissingNums=1;
         for (int i = 2; i <=n; i++) {
             xorMissingNums=xorMissingNums^i;
         }

         for (int i = 0; i < arr.length; i++) {
             xorMissingNums=xorMissingNums^arr[i];
         }

         // divide the array into two sets having rightmost set as 1 and 0 , because out if missing numbers one will
         // have the rightmost set bit as 0 and other as 1

         int sitBitNo = xorMissingNums & ~(xorMissingNums-1);

         int x = 0, y = 0; // Initialize missing numbers
         for (int i = 0; i < n-2; i++)
         {
             if ((arr[i] & sitBitNo) > 0)

                 /*XOR of first set in arr[] */
                 x = x ^ arr[i];
             else
                 /*XOR of second set in arr[] */
                 y = y ^ arr[i];
         }

         for (int i = 1; i <= n; i++)
         {
             if ((i & sitBitNo)>0)

                /* XOR of first set in arr[] and
                   {1, 2, ...n }*/
                 x = x ^ i;
             else
                /* XOR of second set in arr[] and
                    {1, 2, ...n } */
                 y = y ^ i;
         }

         System.out.println("XOR Method: " + x + " " + y);

     }
}
