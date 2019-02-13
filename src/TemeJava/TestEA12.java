package TemeJava;

import java.util.Arrays;

public class TestEA12 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(removePosition(new int[] {}, 0)));
	}

	public static int[] removePosition(int[] arr, int pos) {

		if (pos < arr.length && pos >= 0 && arr.length > 0) {
			int[] newarr = new int[arr.length - 1];
			int j = 0;

			for (int i = 0; i < arr.length; i++) {
				if (i != pos) {
					newarr[j] = arr[i];
					j++;
				}
			}
			return newarr;
		}
		return null;
	}
}
