package TemeJava;

public class TestEA1 {
	public static void main(String[] args) {
		System.out.println(reverse(50023400));
	}

	public static int reverse(int n) {
		int c = 0;
		int newNr = 0;
		int restNr = n;

		while (restNr > 0) {
			c = restNr % 10;
			restNr = restNr / 10;
			newNr *= 10;
			newNr += c;

		}

		return newNr;
	}
}
