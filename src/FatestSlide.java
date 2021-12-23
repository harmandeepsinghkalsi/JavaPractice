package practice;


import java.util.Scanner;

public class FatestSlide {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int data[][] = new int[n][n];

        for (int i = 0; i < data.length; i++)
        {
            data[i]=new int[i+1];
            for (int j = 0; j <= i; j++)
                data[i][j] = sc.nextInt(); //or whatever you want to store
        }

        System.out.println(findMinPath(data));

    }

    public static int findMinPath(int[][] data){

        for (int i = data.length-1; i>=0; i--) {
            for (int j = 0; j < data[i].length-1; j++) {

                int min = Integer.min(data[i][j],data[i][j+1]);
                data[i-1][j] = min+data[i-1][j];
            }
        }

        return data[0][0];
    }


}
