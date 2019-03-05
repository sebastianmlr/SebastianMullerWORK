package TemeJava;

public class TestEA20 {
	public static void main(String[] args) {
		// System.out.println(sudokuChecker(new int[][] { { 0, 5, 8 }, { 2, 0, 3 }, { 0,
		// 27, 0 } }));
		// System.out.println(sudokuChecker(new int[][] { { 1, 2, 0 }, { 4, 5, 0 }, { 0,
		// 1, 9 } }));
		// System.out.println(sudokuChecker(new int[][] { { 1, 2, 3 }, { 0, 4, 9 } }));
		// System.out.println(sudokuChecker(new int[][] { { 1, 0, 0 }, { 0, 0, 0 }, { 0,
		// 1, 0 } }));
		System.out.println(sudokuChecker(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } }));
	}

	public static boolean sudokuChecker(int[][] matrix) {
		int history[] = new int[9];
		int h = 0;
		if (matrix[0].length != 3 || matrix[1].length != 3 || matrix.length != 3) {
			return false;
		}
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix.length; y++) {
				if (matrix[x][y] < 0 || matrix[x][y] > 9) {
					return false;
				}
				for (int elemH : history) {

					if (elemH == matrix[x][y] && matrix[x][y] != 0) {
						return false;
					} else if (matrix[x][y] != 0) {
						history[h] = matrix[x][y];
						h++;
						break;
					}
				}

			}

		}
		return true;
	}
}
