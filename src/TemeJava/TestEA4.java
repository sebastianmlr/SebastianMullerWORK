package TemeJava;

public class TestEA4 {
	public static void main(String[] args) {
		System.out.println(cmmmc(8, 6));
	}

	public static int cmmmc(int a, int b) {
		int nextNr = a > b ? a : b;
		while ((nextNr % a) != 0 || (nextNr % b) != 0) {
			nextNr++;
		}
		return nextNr;
	}
}
