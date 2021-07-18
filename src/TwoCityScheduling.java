import java.util.Arrays;
import java.util.Comparator;

//Leet code
public class TwoCityScheduling {

	public static void main(String[] args) {
		int costs[][] = { { 518, 518 }, { 71, 971 }, { 121, 862 }, { 967, 607 }, { 138, 754 }, { 513, 337 },
				{ 499, 873 }, { 337, 387 }, { 647, 917 }, { 76, 417 } };

		Comparator<int[]> cmp = Comparator.<int[]>comparingInt(x -> Math.abs(x[1] - x[0])).reversed();
		costs = Arrays.stream(costs).sorted(cmp).map(e -> new int[] { e[0], e[1] }).toArray(int[][]::new);
		
		for (int i = 0; i < costs.length; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(costs[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println(twoCitySchedCost(costs));
	}

	public static int twoCitySchedCost(int[][] costs) {

		int totalCost = 0;
		int countA = 0;
		int countB = 0;
		for (int i = 0; i < costs.length; i++) {

			int costA = costs[i][0];
			int costB = costs[i][1];

			if ((costA < costB && countA < costs.length / 2) || countB == costs.length / 2) {
				totalCost += costA;
				countA++;
			} else if ((costB < costA && countB < costs.length / 2) || countA == costs.length / 2) {
				totalCost += costB;
				countB++;
			}
		}
		return totalCost;
	}
}
