package TemeJava;

import java.util.Arrays;

public class TestEA17 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeDuplicates(new int[] { 1, 1, 2, 2, 2, 3, 3, 3, 3 })));
	}

	public static int[] removeDuplicates(int[] arr) {

		if (arr.length == 0) {
			int[] newArr = new int[0];
			return newArr;
		}
		int k = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] != arr[i]) {
				k++;
			}
		}
		int[] newArr = new int[k];
		k = 0;
		newArr[k] = arr[0];
		k++;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] != arr[i]) {
				newArr[k] = arr[i];
				k++;
			}
		}
		return newArr;
	}
}
