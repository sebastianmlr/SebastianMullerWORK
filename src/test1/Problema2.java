package test1;

import java.util.Arrays;

public class Problema2 {
	public static void main(String[] args) {
		System.out.println(isSorted(new int[] { 1, 2, 5, 5, 9 }));
	}

	public static boolean isSorted(int[] arr) {
		int[] arrSortat = new int[arr.length];
		arrSortat = arr.clone();
		Arrays.sort(arrSortat);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arrSortat[i]) {
				return false;
			}
		}
		return true;
	}
}
