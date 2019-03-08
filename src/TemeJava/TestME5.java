package TemeJava;

public class TestME5 {
	public static void main(String[] args) {
		System.out.println(getClimbingOptions(1));
		System.out.println(getClimbingOptions(2));
		System.out.println(getClimbingOptions(3));
		System.out.println(getClimbingOptions(4));
		System.out.println(getClimbingOptions(5));
		System.out.println(getClimbingOptions(6));
	}

	public static int getClimbingOptions(int stairs) {

		int nrOptiuni = 0;
		for (int m = stairs; m >= ((stairs / 2) + (stairs % 2)); m--) {
			int variantaDeBaza[] = new int[m];
			int catiDeDoi = ((stairs / m) == 2 ? m : 0) + (stairs % m);

			for (int i = 0; i < m; i++) {
				if (catiDeDoi > 0) {
					catiDeDoi--;
					variantaDeBaza[i] = 2;
				} else {
					variantaDeBaza[i] = 1;
				}
			}
			// System.out.print(Arrays.toString(variantaDeBaza));
			// System.out.println(calcNrSolutii(variantaDeBaza));
			nrOptiuni += calcNrSolutii(variantaDeBaza);
		}
		return nrOptiuni;
	}

	public static int calcNrSolutii(int[] arr) {
		int sub = 1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[j] != 0) {
					count++;
					arr[j] = 0;
				}
			}
			sub *= factorial(count);
		}
		return factorial(arr.length) / sub;
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return factorial(n - 1) * n;
	}

}
