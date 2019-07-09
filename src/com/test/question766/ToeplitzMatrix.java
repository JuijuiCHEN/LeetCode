package com.test.question766;

/*
 * 從左上角到右下角的每個對角線具有相同的元素則返回true。
 */
public class ToeplitzMatrix {

	public static void main(String[] args) {
//		int[][] matrix = { { 1, 2, 3, 4 }, //
//							{ 5, 1, 2, 3 }, //
//							{ 9, 5, 1, 3 } };
		int[][] matrix = { { 84, 12 } };
		System.out.println(isToeplitzMatrix(matrix));
	}

	public static boolean isToeplitzMatrix(int[][] matrix) {

		// 跑每行array
		for (int r = 0; r < matrix.length; ++r) {
			// 跑每行中的每個數字
			for (int c = 0; c < matrix[0].length; ++c) {
				// 從後往前對角線比對，必須數字一樣(才表示對角是一樣的)
				if (r > 0 && c > 0 && matrix[r - 1][c - 1] != matrix[r][c])
					return false;
			}
		}
		return true;

	}

}
