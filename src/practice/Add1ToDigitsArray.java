package practice;

import java.util.ArrayList;

public class Add1ToDigitsArray {
	
	public static void main(String[] args){

		
		int a[] = {0,0,0,2,5,0};
		ArrayList<Integer> al = new ArrayList<>();
		boolean flag = true;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count++;
				continue;
			} else {
				flag = false;
				break;
			}
		}

		if (flag)
			al.add(0, 1);
		else {

			for (int j = count; j < a.length; j++) {
				al.add(a[j]);
			}

			int n = al.size() - 1;

			// Add 1 to last digit and find carry
			al.set(n, al.get(n) + 1);
			int carry = al.get(n) / 10;
			al.set(n, al.get(n) % 10);

			// Traverse from second last digit
			for (int i = al.size() - 2; i >= 0; i--) {
				if (carry == 1) {
					al.set(i, al.get(i) + 1);
					carry = al.get(i) / 10;
					al.set(i, al.get(i) % 10);
				}
			}

			// If carry is 1, we need to add
			// a 1 at the beginning of vector
			if (carry == 1)
				al.add(0, 1);

		}


		int[] output = al.stream().mapToInt(i -> i).toArray();
		
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}

	}

}
