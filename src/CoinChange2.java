// using the coins find no of ways to make the total
public class CoinChange2 {

	public static void main(String[] args) {

		System.out.println(CoinChange2.change(5, new int[] { 1, 10, 20 }));
	}

	public static int change(int amount, int[] coins) {

		int temp[] = new int[amount + 1];

		temp[0] = 1;

		for (int i = 0; i < coins.length; i++) {
			for (int j = 1; j <= amount; j++) {
				if (j >= coins[i]) {
					temp[j] += temp[j - coins[i]];
				}
			}
		}
		return temp[amount];
	}

}