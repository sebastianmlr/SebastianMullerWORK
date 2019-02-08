package TemeJava;

import java.util.Scanner;

public class TestTR6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(avg(a, b));
		scanner.close();
	}

	public static double avg(int a, int b) {
		return (a + b) / (double) 2;

	}

}
