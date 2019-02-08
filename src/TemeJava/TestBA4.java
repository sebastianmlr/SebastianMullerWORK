package TemeJava;

public class TestBA4 {
	public static void main(String[] args) {
		System.out.println(max(new int[] { 1, 100, -5, 7, 20 }));

	}

	public static int max(int[] sir) {
		int maretul = 0;
		int i = 0;
		while (i < sir.length) {
			maretul = sir[i] > maretul ? sir[i] : maretul;
			i++;
		}
		return maretul;
	}
}
