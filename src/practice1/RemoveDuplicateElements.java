package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import dataStructures.LinkedList;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		ArrayList<Character> al = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			if (!al.contains(str.charAt(i)))
				al.add(str.charAt(i));

		}

		System.out.println(al);
		String result = "";
		for (int i = 0; i < al.size(); i++) {
			result+=al.get(i);
		}
		System.out.println(result);
	}
}
