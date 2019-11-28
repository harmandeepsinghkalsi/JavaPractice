package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class FindClosestGreaterAndSmallerNumber {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();

			if (i == 0)
				System.out.println("-1" + " " + "-1");
			else {
				int smaller = findClosestSmaller(al, x);
				int greater = findClosestGreater(al, x);
				System.out.println(smaller + " " + greater);
			}
			al.add(x);
		}

	}

	public static int findClosestSmaller(ArrayList<Integer> al, int x) {

		int returnValue = -1;
		int smaller = Integer.MAX_VALUE;
		for (int i = 0; i < al.size(); i++) {

			int diff = x - al.get(i);
			if (diff > 0 && diff < smaller) {
				smaller = diff;
				returnValue = al.get(i);
			}
		}

		return returnValue;
	}

	public static int findClosestGreater(ArrayList<Integer> al, int x) {

		int returnValue = -1;
		int greater = Integer.MIN_VALUE;
		for (int i = 0; i < al.size(); i++) {

			int diff = x - al.get(i);
			if (diff < 0 && diff > greater) {
				greater = diff;
				returnValue = al.get(i);
			}
		}

		return returnValue;
	}
}
