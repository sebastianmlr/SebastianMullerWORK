package TemeJava;

public class TestTR10 {
	public static void main(String[] args) {

		System.out.println(marginsAverage(new int[] { 0, 1, 2, 3 }));
	}

	public static int marginsAverage(int[] arr) {
		return arr.length == 0 ? -1 : (arr[0] + arr[arr.length - 1]) / 2;

	}
}
