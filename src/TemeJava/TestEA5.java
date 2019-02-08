package TemeJava;

public class TestEA5 {
	public static void main(String[] args) {
		System.out.println(cmmdc(6, 1));
	}

	public static int cmmdc(int a, int b) {
		int nextNr = a > b ? b : a;
		while ((a % nextNr) != 0 || (b % nextNr) != 0) {
			nextNr--;
		}
		return nextNr;
	}
}
