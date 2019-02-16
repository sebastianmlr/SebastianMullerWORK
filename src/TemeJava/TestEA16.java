package TemeJava;

public class TestEA16 {
	public static void main(String[] args) {
		System.out.println(countAppearances(new int[] { 1, 1, 2, 1, 2, 1, 1, 1 }, new int[] { 1, 2, 1 }));
	}

	public static int countAppearances(int[] a, int[] b) {
		int count = 0;
		for (int i = 0; i <= (a.length - b.length); i++) {
			int rez = 0, j = 0;
			for (int elementB : b) {
				if (a[i + j] == elementB) {
					rez++;
					j++;
				} else {
					break;
				}
			}
			if (rez == b.length && b.length > 0) {
				count++;
			}

		}
		return count;
	}
}
