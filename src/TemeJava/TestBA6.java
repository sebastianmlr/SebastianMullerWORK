package TemeJava;

public class TestBA6 {
	public static void main(String[] args) {
		System.out.println(arrayToNumber(new int[] { 5, 0, 0, 1, 2, 7 }));
	}

	public static int arrayToNumber(int[] sir) {
		int newNr = 0;
		int loc = 1;
		int i = sir.length - 1;
		if (sir.length == 0) {
			return -1;
		}
		while (i >= 0) {
			if (sir[i] >= 0 && sir[i] <= 9) {
				newNr += sir[i] * loc;
				loc *= 10;

				i--;
			} else {
				return -2;
			}

		}
		return newNr;
	}

}
