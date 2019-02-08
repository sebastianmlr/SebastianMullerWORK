package TemeJava;

public class TestBA2 {
	public static void main(String[] args) {
		System.out.println(countNegatives(new int[] { 10, 14, -21, 3, -55, 2, -3 }));

	}

	public static int countNegatives(int[] sir) {
		int countN = 0;
		int i = 0;
		while (i < sir.length) {
			countN = countN + (sir[i] < 0 ? 1 : 0);
			i++;
		}
		return countN;

	}
}
