package TemeJava;

import java.util.Scanner;

public class TestTR4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("suma in EUR: ");
		float sumaInEur = scn.nextFloat();
		System.out.print("cursul valutar: ");
		float cursValutar = scn.nextFloat();
		System.out.println("Suma in RON: " + sumaInEur * cursValutar);
		scn.close();

	}
}
