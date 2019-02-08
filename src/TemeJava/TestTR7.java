package TemeJava;

import java.util.Scanner;

public class TestTR7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double tempFahrenheit = scanner.nextDouble();

		System.out.println(fahrenheitToCelsius(tempFahrenheit));
		scanner.close();

	}

	public static double fahrenheitToCelsius(double temperature) {
		// T(°C) = (T(°F) - 32) × 5/9
		return ((temperature - 32) * 5 / 9);
	}
}
