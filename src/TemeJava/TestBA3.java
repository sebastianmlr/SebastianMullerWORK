package TemeJava;

import java.util.Scanner;

public class TestBA3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.println(factorial(n));
		scanner.close();
	}

	public static int factorial(int n) {
		int nFactorial = 1;
		for (int i = 1; i <= n; i++) {
			nFactorial *= i;
		}
		return nFactorial;

	}

}
