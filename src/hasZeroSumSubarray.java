package practice;

import java.util.HashSet;

public class hasZeroSumSubarray {

    public static void main(String[] args) {

        int arr[] = {1,2,2,1,-3};
        //System.out.println(hasZeroSumSubarray(arr));
        System.out.println(hasZeroSumSubarray2(arr));
    }

   //O(n) approach: prefix sum
    public static boolean hasZeroSumSubarray2(int[] nums){

        if(nums.length==0)
            return false;
        if(nums[0]==0)
            return true;

        HashSet<Integer> hs = new HashSet<>();
        hs.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {

            if (nums[i]==0)
                return true;

            nums[i]+=nums[i-1];

            if(nums[i]==0 || hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }

    public static boolean hasZeroSumSubarray(int[] nums)
    {
        // Write your code here...

        if(nums.length == 0)
            return false;
        int i=0,sum=0;
        if(nums[i]==0)
            return true;

        sum+=nums[i];
        while(i< nums.length-1){
            int j =i+1;
            while(j<nums.length){
                if(sum+nums[j]==0){
                    return true;
                }
                sum+=nums[j];
                j++;
            }
            i++;
            sum=0;
        }

        return false;
    }
}
