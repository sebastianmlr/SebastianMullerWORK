package TemeJava;

public class TestBA1 {
	public static void main(String[] args) {
		System.out.println(avg(new int[] { 1, 7, 3, 6 }));
	}

	public static double avg(int[] sir) {
		int suma = 0;
		int i = 0;
		while (i < sir.length) {
			suma = suma + sir[i];
			i++;
		}
		return suma / (double) sir.length;

	}
}
