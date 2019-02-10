package TemeJava;

public class TestEA8 {
	public static void main(String[] args) {
		int[] a = {};
		int[] b = { 1, 2, 3 };
		System.out.println(contains(a, b));
	}

	public static boolean contains(int[] a, int[] b) {
		if (b.length == 0) {
			return true;
		} else if (a.length == 0) {
			return false;
		} else {

			int j = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == b[j]) {
					j++;
					if (j == b.length) {
						return true;
					}
				}
			}
			return false;
		}
	}
}