package TemeJava;

public class TestEA10 {
	public static void main(String[] args) {
		/*
		 * fibo(0) = 0 fibo(1) = 1 fibo(n) = fibo(n-1) + fibo(n-2)
		 */
		System.out.println(fibo(12));
	}

	public static int fibo(int n) {
		if (n > 0) {
			int[] fibo = new int[n + 1];
			fibo[0] = 0;
			fibo[1] = 1;
			for (int i = 2; i < fibo.length; i++) {
				fibo[i] = fibo[i - 1] + fibo[i - 2];
				// System.out.println(fibo[i]);
			}
			return fibo[n];
		} else if (n == 0) {
			return 0;
		}
		return -1;

	}
}
