package codingTest;

import java.io.IOException;
import java.util.Scanner;


//Madison, is a little girl who is fond of toys. Her friend Mason works in a toy manufacturing factory . Mason has a 2D board  of size  with  rows and  columns. The board is divided into cells of size  with each cell indicated by it's coordinate . The cell  has an integer  written on it. To create the toy Mason stacks number of cubes of size  on the cell .

// Given the description of the board showing the values of  and that the price of the toy is equal to the 3d surface area find the price of the toy.

public class ThreeDSurfaceArea {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// code

		Scanner sc = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// int t = sc.nextInt();
		// sc.nextLine();
		// int t= Integer.parseInt(br.readLine());

		int dx[] = {1, -1, 0, 0};
		int dy[] = {0, 0, 1, -1};

		int h, w;

		h = sc.nextInt();
		w = sc.nextInt();
		int a[][] = new int[h][w];

		for (int x = 0; x < h; x++) {
			for (int y = 0; y < w; y++) {
				a[x][y] = sc.nextInt();
			}

		}

		int ans = 2 * h * w; // top + bottom

		for (int x = 0; x < h; x++) {
			for (int y = 0; y < w; y++) {
				for (int i = 0; i < 4; i++) {
					int x_ = x + dx[i];
					int y_ = y + dy[i];

					if (isSafe(x_, y_, h, w) && (a[x_][y_] < a[x][y])) {

						ans += a[x][y] - a[x_][y_];
					} else if(!isSafe(x_,y_,h,w)){

						ans += a[x][y];
					}
				}
			}
		}
		System.out.println(ans);

	}

	public static boolean isSafe(int x_, int y_, int h, int w) {
		// TODO Auto-generated method stub

		if (x_ < 0 || x_ >= h || y_ < 0 || y_ >= w) {
			return false;
		} else
			return true;

	}

	

}
