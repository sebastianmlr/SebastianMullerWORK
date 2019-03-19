package test1;

public class Problema3 {
	public static void main(String[] args) {
		System.out.println(next(new int[] { 1, 5, 7, 2, 4 }, 14));

	}

	public static int next(int[] arr, int n) {

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1 && arr[i] == n) {
				return -1;
			} else if (arr[i] == n) {
				return arr[i + 1];
			}

		}
		return -2;
	}
}
