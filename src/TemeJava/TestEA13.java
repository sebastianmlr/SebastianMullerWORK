package TemeJava;

public class TestEA13 {
	public static void main(String[] args) {
		System.out.println(getMaxTriple(new int[] {})); // 36
	}

	public static int getMaxTriple(int[] arr) {
		int sumTripl = 0;
		if (arr.length < 4) {
			for (int element : arr) {
				sumTripl += element;
			}
			return sumTripl;
		}
		for (int i = 0; i <= arr.length - 3; i++) {
			if (sumTripl < (arr[i] + arr[i + 1] + arr[i + 2])) {
				sumTripl = arr[i] + arr[i + 1] + arr[i + 2];
			}
		}
		return sumTripl;
	}

}
