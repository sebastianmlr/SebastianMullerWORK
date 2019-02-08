package TemeJava;

import java.util.Scanner;

public class TR3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int inputValue = scanner.nextInt();

		System.out.println(inputValue * inputValue);
		System.out.println(inputValue * inputValue * inputValue);

		scanner.close();
	}
}
