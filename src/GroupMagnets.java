import java.util.Arrays;

public class GroupMagnets {

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 4;
		int[] n3 = { 1,5,6,1,8,3,12,2,13,7 }; // 1,1,2,3,5,6,7,8,9,11,12,13
		// 0,1,1,2,1,1,1,1,2,1,1

		System.out.println(magnets(n1, n2, n3));
	}

	public static int magnets(int n1, int n2, int n3[]) {

		Arrays.sort(n3);
		int i = 0;
		int maxCount=0;
		while (i < n1) {
			int j = i + 1;
			int count = 1;
			int maxNumAdded = n3[i];
			while (j < n1) {
				if(n3[j]-maxNumAdded>=n2) {
					count++;
					maxNumAdded=n3[j];
				}
				j++;
			}
			if(count > maxCount) {
				maxCount=count;
			}
			i++;
		}

		return maxCount;

	}

}
