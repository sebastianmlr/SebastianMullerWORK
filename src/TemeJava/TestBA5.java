package TemeJava;

public class TestBA5 {
	public static void main(String[] args) {
		System.out.println(product(new int[] { 0, 0, 0 }));

	}

	public static int product(int[] sir) {
		int prod = 1;
		int i = 0;
		while (i < sir.length) {
			prod = sir[i] != 0 ? sir[i] * prod : prod;
			i++;
		}
		return prod;
	}

}
