package TemeJava;

import java.io.IOException;

public class ceasdigital2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		long h, m, s;

		String[][] digitStrings = { { " _ ", "| |", "|_|" }, { "   ", "  |", "  |" }, //
				{ " _ ", " _|", "|_ " }, { " _ ", " _|", " _|" }, { "   ", "|_ ", "  |" }, //
				{ " _ ", "|_ ", " _|" }, { "   ", "|_ ", "|_|" }, { " _ ", "  |", "  |" }, //
				{ " _ ", "|_|", "|_|" }, { " _ ", "|_|", "  |" } };

		// for (int i = 0; i <= 9; i++) {
		// System.out.println(digitStrings[i][0]);
		// System.out.println(digitStrings[i][1]);
		// System.out.println(digitStrings[i][2]);
		// }
		while (true) {
			h = (System.currentTimeMillis() / 1000 / 60 / 60 % 24) + 2;
			m = System.currentTimeMillis() / 1000 / 60 % 60;
			s = System.currentTimeMillis() / 1000 % 60;
			for (int i = 0; i <= 2; i++) {
				System.out.print(digitStrings[(int) (h / 10)][i] + digitStrings[(int) (h % 10)][i]);
				System.out.print(i == 0 ? "   " : " o ");
				System.out.print(digitStrings[(int) (m / 10)][i] + digitStrings[(int) (m % 10)][i]);
				System.out.print(i == 0 ? "   " : " o ");
				System.out.println(digitStrings[(int) (s / 10)][i] + digitStrings[(int) (s % 10)][i]);

			}
			Thread.sleep(1000);

		}
	}

}
