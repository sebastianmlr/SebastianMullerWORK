package s02;

import java.util.Arrays;

public class arraysmlr {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 7;
		arr[4] = 5;

		System.out.println(arr.length);
		System.out.println(arr[0]);

		System.out.println(Arrays.toString(arr));

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(arr2));

		int[][] matrice = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, };
		System.out.println(matrice[0][1]);
		System.out.println(matrice[2][5]);
		System.out.println(Arrays.toString(matrice));
	}

}
