package TemeJava;

import java.util.Arrays;

public class TestEA14 {
	public static void main(String[] args) {
		System.out.println(Arrays
				.toString(getMatrixSum(new int[][] { { 8, -2 }, { 12, 3 } }, new int[][] { { 4, 6 }, { 2, 1 } })));
	}

	public static int[][] getMatrixSum(int[][] matrix1, int[][] matrix2) {
		int[][] newMatrix = new int[matrix1.length][matrix1.length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				newMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return newMatrix;
	}
}
