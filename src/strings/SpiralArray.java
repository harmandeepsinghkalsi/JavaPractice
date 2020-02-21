import java.util.Scanner;

public class SpiralArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int arr[][] = new int[rows][cols];
		int number = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = number++;
			}
		}

		spiralPrinting(arr, rows, cols);

	}

	public static void spiralPrinting(int arr[][], int rows, int cols) {

		int i;
		int k = 0, l = 0;

		while (k < rows && l < cols) {

			for (i = l; i < cols; i++) {
				System.out.print(arr[k][i]+" ");
			}
			k++;

			for (i = k; i < rows; i++) {
				System.out.print(arr[i][cols-1]+" ");
			}
			cols--;

			if (k < rows) {
				for (i = cols - 1; i >= l; i--) {
					System.out.print(arr[rows-1][i]+" ");
				}
				rows--;
			}
			
			if (l < cols) {
				for (i = rows-1; i >= k; i--) {
					System.out.print(arr[i][l]+" ");
				}
				l++;
			}

		}

	}
}
