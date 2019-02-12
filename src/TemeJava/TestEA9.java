package TemeJava;

public class TestEA9 {
	public static void main(String[] args) {
		System.out.println(countPairs(new int[] {}, 10));
	}

	public static int countPairs(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int k = i + 1; k < arr.length; k++) {
				if ((arr[i] + arr[k]) == n) {
					System.out.println(arr[i] + " " + arr[k]);
					count++;
				}
			}

		}
		return count;
	}
}
