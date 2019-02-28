package TemeJava;

public class TestEA19 {
	public static void main(String[] args) {
		System.out.println(isSudokuLine(new int[] { 9, 3, 4, 1, 7, 6, 2, 5, 8 }));
		System.out.println(isSudokuLine(new int[] { 0, 0, 3, 0, 1, 0, 7, 0, 0 }));
		System.out.println(isSudokuLine(new int[] { 1, 5, 0, 0, 5, 6, 7, 7, 0 }));
		System.out.println(isSudokuLine(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }));
	}

	public static boolean isSudokuLine(int[] arr) {
		if (arr.length != 9) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[i] != 0 && arr[j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

}
