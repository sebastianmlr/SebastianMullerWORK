package TemeJava;

public class TestBA9 {
	public static void main(String[] args) {

		System.out.println(getDiagonalSum(new int[][] { { 11, 7 }, { 4, -3 } })); // 8
	}

	public static int getDiagonalSum(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
		}
		return sum;
	}

}
