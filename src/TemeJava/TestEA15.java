package TemeJava;

import java.util.Arrays;

public class TestEA15 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getMatrixProduct(new int[][] { { 1, -2, 1, 4 }, { 2, 3, 0, -3 } },
				new int[][] { { 1, 0 }, { -2, 1 }, { 4, 0 }, { -1, 3 } })));
	}

	public static int[][] getMatrixProduct(int[][] matrix1, int[][] matrix2) {
		int[][] newMatrix = new int[matrix1.length][matrix1.length];
		for (int k = 0; k < matrix1.length; k++) {
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix2.length; j++) {
					newMatrix[k][i] += matrix1[k][j] * matrix2[j][i];

				}
			}
		}
		return newMatrix;
	}
}
