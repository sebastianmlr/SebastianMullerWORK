package test1;

public class Problema4 {
	public static void main(String[] args) {
		combinations("", "abcd", 2);
	}
	// public static void combinations(String s, int n) {

	public static void combinations(String prefix, String s, int n) {
		if (n == 0) {
			System.out.print(prefix + ", ");
		}
		for (int i = 0; i < s.length(); i++) {
			String prfx = s.substring(i, i + 1);
			String rest = s.substring(i + 1, s.length());
			combinations(prefix + prfx, rest, n - 1);

		}

	}

}
