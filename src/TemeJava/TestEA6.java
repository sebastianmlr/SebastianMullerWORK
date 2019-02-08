package TemeJava;

import java.util.Arrays;

public class TestEA6 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(intToArray(125610445)));
	}

	public static int[] intToArray(int n) {
		if (n == 0) {
			return new int[] { 0 };
		}
		int restNr = n;
		int nrLength = 0;
		while (restNr > 0) {
			restNr /= 10;
			nrLength++;
		}
		int[] sirRezultat = new int[nrLength];
		int i = nrLength - 1;
		restNr = n;
		while (restNr > 0) {
			sirRezultat[i] = restNr % 10;
			restNr /= 10;
			i--;
		}

		return sirRezultat;
	}

}
