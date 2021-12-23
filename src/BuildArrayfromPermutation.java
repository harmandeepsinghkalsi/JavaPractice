package practice;

public class BuildArrayfromPermutation {

    public static void main(String[] args) {

        int arr[] = {0,2,1,5,3,4}; //x=a+(b%n)*n; a=x%n and b = x/n
        int res[] = new int[arr.length];
        // this is O(N) space
//        for (int i = 0; i < arr.length; i++) {
//            res[i]=arr[arr[i]];
//        }
//
//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i]+" ");
//        }


        //this is O(1) space a= nums[i] and b= nums[nums[i]]
        // a=(a+nb)%n and b = (a+bn)/n

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i]+((arr[arr[i]]%arr.length)*arr.length);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]/arr.length;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
