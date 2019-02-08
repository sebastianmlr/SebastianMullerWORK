package TemeJava;

import java.util.Scanner;

public class TestTR11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int scnValue = scn.nextInt();

		System.out.println(isEven(scnValue));
		scn.close();

	}

	public static boolean isEven(int n) {
		// System.out.println((n % 2) == 0 ? "T" : "F");

		return (n % 2) == 0 ? true : false;

	}

}
