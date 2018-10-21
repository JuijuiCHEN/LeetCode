package com.test.question867;

import java.util.Arrays;

/*
 * 做出 int[][] transpose(int[][] A) 方法
 * 返回該陣列在對角上的轉置，切換陣列行和列的索引
 * ex.  參數: [1,2,3]，[4,5,6]，[7,8,9]  
 * 		返回: [1,4,7]，[2,5,8]，[3,6,9]
 * 參數第0個陣列會移至  返回第0.1.2個陣列的第0個位置....以此類推
 */
public class TransposeMatrix {

	public static void main(String[] args) {
//		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] ans = transpose(A);
		for (int[] a : ans) {
			System.out.println("ans= " + Arrays.toString(a));
		}

	}

	public static int[][] transpose(int[][] A) {
		int[][] ans = new int[A[0].length][A.length];
		int x = 0;

		for (int[] a : A) {
			int y = 0;
			System.out.println("a= " + Arrays.toString(a));
			System.out.println("第0個= " + a[0]);
			
			for (int i = 0; i < a.length; i++) {
				ans[y][x] = a[y];
				y++;
			}
			x++;
		}

		return ans;

	}

}
