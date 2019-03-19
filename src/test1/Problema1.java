package test1;

public class Problema1 {
	public static void main(String[] args) {
		System.out.println(harmonicAvg(-3, 3));
	}

	public static double harmonicAvg(int a, int b) {
		if (a + b == 0) {
			return 0;
		}
		double mh = (2 * a * b) / (a + b);
		return mh;
	}
}
