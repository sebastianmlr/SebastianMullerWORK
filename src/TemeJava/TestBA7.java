package TemeJava;

public class TestBA7 {
	public static void main(String[] args) {
		System.out.println(find(new int[] { 10, 22, 1, 2, 7 }, 22));

	}

	public static int find(int[] sir, int n) {
		int i = 0;
		while (i < sir.length) {
			if (n == sir[i]) {
				return i;
			}
			i++;
		}
		return -1;
	}
}
