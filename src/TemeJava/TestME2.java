package TemeJava;

import java.util.Arrays;

public class TestME2 {
	static int[] arr, newArr, stivaBtr, locDinSir;
	static int etajMaxStiva, etajActualInStiva, nextInNewArr = 0;
	static boolean succesorOK, validareOK;

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getPermutations(2211)));
		// System.out.println(Arrays.toString(intToArray(153)));
	}

	public static int[] getPermutations(int n) {
		etajMaxStiva = intToArray(n).length;
		newArr = new int[calcNrSolutii(n)];
		// System.out.println(factorial(etajMaxStiva));
		// System.out.println(factorial(4) / factorial(2));
		backTr();
		return newArr;
	}

	static void backTr() {
		// int k = 0;
		locDinSir = new int[etajMaxStiva + 1];
		stivaBtr = new int[etajMaxStiva + 1];
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
					// System.out.println(arrayToInt(stivaBtr));
					// newArr[k++] = arrayToInt(stivaBtr);
					esteSolutie(arrayToInt(stivaBtr));
				} else {
					etajActualInStiva++;
					stivaBtr[etajActualInStiva] = 0;
					locDinSir[etajActualInStiva] = 0;
				}
			} else {
				etajActualInStiva--;
			}
		}
		etajMaxStiva--;

	}

	private static void esteSolutie(int newSol) {
		for (int i = 0; i <= nextInNewArr; i++) {
			if (newArr[i] == newSol) {
				return;
			}
		}
		newArr[nextInNewArr++] = newSol;

	}

	private static int calcNrSolutii(int inpt) {
		int[] prov = intToArray(inpt);
		int count = 1, sub = 1;

		for (int i = 0; i < prov.length; i++) {
			count = 1;
			for (int j = i + 1; j < prov.length; j++) {
				if (prov[i] == prov[j] && prov[j] != 0) {
					count++;
					prov[j] = 0;
				}

			}
			sub *= factorial(count);
		}
		return factorial(prov.length) / sub;
	}

	static int factorial(int n) {
		int rez = 1;
		for (int i = 1; i <= n; i++) {
			rez *= i;
		}
		return rez;
	}

	static boolean validare() {
		for (int i = 1; i < etajActualInStiva; i++) {
			if (locDinSir[etajActualInStiva] == locDinSir[i]) {
				return false;
			}
		}
		return true;

	}

	static boolean succesor() {
		if (locDinSir[etajActualInStiva] != (arr.length)) {
			stivaBtr[etajActualInStiva] = arr[locDinSir[etajActualInStiva]];
			locDinSir[etajActualInStiva]++;
			return true;
		} else {
			return false;
		}
	}

	static int nextDinSir(int locInainte) {
		for (int g = 0; g < arr.length - 1; g++) {
			if (arr[g] == locInainte) {
				locDinSir[etajActualInStiva] = g + 1;
				return arr[g + 1];
			} else if (locInainte == 0) {
				locDinSir[etajActualInStiva] = 0;
				return arr[0];
			}
		}
		return 0;
	}

	public static int arrayToInt(int[] arr) {
		int nr = 0;
		for (int element : arr) {
			nr *= 10;
			nr += element;
		}
		return nr;
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
		arr = sirRezultat.clone();
		return sirRezultat;
	}

}
