package TemeJava;

public class TestBA10 {
	public static void main(String[] args) {
		System.out.println(getSecondaryDiagonalSum(
				new int[][] { { 5, 91, 12, 0 }, { 3, 6, 33, 47 }, { 2, 91, 64, 4 }, { 23, 1, 0, 55 } })); // 5
	}

	public static int getSecondaryDiagonalSum(int[][] matrix) {
		int sum = 0, j = 0;
		for (int i = matrix.length - 1; i >= 0; i--) {
			sum += matrix[i][j];
			j++;
		}
		return sum;
	}
}
