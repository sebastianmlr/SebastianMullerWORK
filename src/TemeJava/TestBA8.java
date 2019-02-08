package TemeJava;

import java.util.Arrays;

public class TestBA8 {
	public static void main(String[] args) {
		int sir[] = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(sir));
		System.out.println(Arrays.toString(reverse(sir)));
	}

	public static int[] reverse(int[] sir) {
		int[] sirReverse = new int[sir.length];
		int i = 0;
		int j = sir.length - 1;
		while (i < sir.length) {
			sirReverse[j] = sir[i];
			i++;
			j--;
		}
		return sirReverse;
	}
}
