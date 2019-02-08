package TemeJava;

import java.util.Scanner;

public class TestTR9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("a: ");
		int a = scanner.nextInt();
		System.out.print("b: ");
		int b = scanner.nextInt();
		System.out.print("c: ");
		int c = scanner.nextInt();
		// true daca teorema lui Pitagora (a*a + b*b = c*c) si in plus suma lor este
		// divizibila cu 10
		System.out.println(inPitagoraRelation(a, b, c));

		scanner.close();

	}

	public static boolean inPitagoraRelation(int a, int b, int c) {
		// System.out.println((a + b + c) % 10);
		return ((a * a + b * b) == c * c) ? (a + b + c) % 10 == 0 : false;

	}
}
