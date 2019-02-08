package TemeJava;

import java.util.Scanner;

public class TestTR5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("suma in RON: ");
		float sumaInRon = scanner.nextFloat();
		System.out.print("cursul valutar: ");
		float cursValutar = scanner.nextFloat();
		// int rezultatEur = (int) (sumaInRon / cursValutar);

		System.out.println("Suma in EUR: " + (int) (sumaInRon / cursValutar));
		System.out.println("Suma in RON: " + (int) (sumaInRon % cursValutar));
		scanner.close();
	}

}
