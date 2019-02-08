package TemeJava;

import java.util.Scanner;

public class TestTR8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("a: ");
		double a = scanner.nextDouble();
		System.out.print("b: ");
		double b = scanner.nextDouble();
		System.out.println(divide(a, b));
		scanner.close();

	}

	public static double divide(double a, double b) {
		return b == 0 ? Double.MAX_VALUE : a / b;
	}

}
