package TemeJava;

public class TestME1 {
	static int[] sir, stivaBtr;
	static int etajActualInStiva, etajMaxStiva, nn, count;
	static boolean succesorOK, validareOK;

	public static void main(String[] args) {
		System.out.println(countSums(new int[] { 2, 3, 4, 5, 7, 8 }, 10));
	}

	public static int countSums(int[] arr, int n) {
		stivaBtr = new int[arr.length + 1];
		count = 0;
		sir = arr;
		nn = n;
		etajMaxStiva = arr.length;
		while (etajMaxStiva > 0) {

			etajActualInStiva = 1;
			stivaBtr[1] = 0;
			while (etajActualInStiva > 0) {
				do {
					succesorOK = succesor();
					if (succesorOK) {
						validareOK = validare();
					}

				} while (succesorOK && !(validareOK));
				if (succesorOK) {
					if (etajActualInStiva == etajMaxStiva) {
						VerificaSuma();
					} else {
						etajActualInStiva++;
						stivaBtr[etajActualInStiva] = 0;
					}
				} else {
					etajActualInStiva--;
				}
			}
			etajMaxStiva--;
		}
		return count;
	}

	static boolean succesor() {
		boolean rez;
		if (stivaBtr[etajActualInStiva] != sir[sir.length - 1]) {
			stivaBtr[etajActualInStiva] = nextDinSir(stivaBtr[etajActualInStiva]);
			rez = true;
		} else {
			rez = false;
		}
		return rez;
	}

	static boolean validare() {
		boolean rez = true;

		for (int i = 1; i < etajActualInStiva; i++) {
			if (stivaBtr[i] == stivaBtr[etajActualInStiva]) {
				rez = false;
			}
		}
		return rez;
	}

	static int nextDinSir(int valInainte) {
		for (int g = 0; g < sir.length - 1; g++) {
			if (sir[g] == valInainte) {
				return sir[g + 1];
			} else if (valInainte == 0) {
				return sir[0];
			}
		}
		return 0;
	}

	static void VerificaSuma() {
		int suma = 0;
		for (int i = 1; i <= etajMaxStiva; i++) {
			suma += stivaBtr[i];
			if (stivaBtr[i - 1] > stivaBtr[i]) {
				return;
			}
		}
		if (suma == nn) {
			count++;
		}

	}
}
