package practice;

import java.util.Date;
import java.util.HashSet;

// A number is beautiful if sum of squares of digits = 1. If sum reaches 4 , it is not since it will
// enter a loop of 8 numbers (4->16->37->58->89->145->42->20->4)
public class BeautifulNumber {

    public static void main(String[] args) {

        int l = 1;
        int r = 100000;
        System.out.println(new Date());
        System.out.println(solve(l,r));
        System.out.println(new Date());
    }

    public static long solve(int l , int r){


        long beautifulNumSum = 0;
        for(long i=l;i<=r;i++){

            // Pick up the numbers in the range l to r one by one and process it
            long num = i;
            long sumofSqDigits = 0;
            boolean isBeautifulNumber = true;
            HashSet<Long> hs = new HashSet<Long>();
            sumofSqDigits = findSumOfDigitsSq(num);

            while(sumofSqDigits != 1){

                if(hs.contains(sumofSqDigits)){
                    isBeautifulNumber = false;
                    break;
                }
                hs.add(sumofSqDigits);
                sumofSqDigits=findSumOfDigitsSq(sumofSqDigits);
            }

            if(isBeautifulNumber) {
                System.out.println(num);
                beautifulNumSum += num;
            }

        }
        return beautifulNumSum;
    }

    static long findSumOfDigitsSq(long n){

        long rem = 0;
        long sum = 0;

        while(n>0) {
            rem=n%10;
            sum+=rem*rem;
            n/=10;
        }
        return sum;
    }
}
