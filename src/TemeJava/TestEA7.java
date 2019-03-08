package TemeJava;

import java.util.Arrays;

public class TestEA7 {
	public static void main(String[] args) {
		System.out.println(nthSmallest(new int[] { 6, 8, 0, 1, 4, 9 }, 1));
	}

	public static int nthSmallest(int[] sir, int n) {
		Arrays.sort(sir);
		// System.out.println(Arrays.toString(sir));
		return n <= sir.length ? sir[n - 1] : -1;
	}

}
//este posibil si recursiv