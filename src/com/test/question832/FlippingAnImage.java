package com.test.question832;

import java.util.Arrays;

/*
 * 做出傳入int[][] A 之 flipAndInvertImage方法
 * 需反轉陣列內的每一行 ex.[1, 1, 0] -> [0, 1, 1]
 * 在反轉數字0變1，1變0 之後回傳。
 * ex. [0, 1, 1] -> [1, 0, 0]
 */

public class FlippingAnImage {

	public static void main(String[] args) {
		int[][] a = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

		int[][] as = flipAndInvertImage(a);
		for (int[] is : as) {
			System.out.println(Arrays.toString(is));
		}

	}

	public static int[][] flipAndInvertImage(int[][] A) {
		int[][] ans = new int[A.length][A[0].length];
		int num = 0;

		// 先反轉每一行
		for (int[] a : A) {
			System.out.println("反轉前: " + Arrays.toString(a));

			int j = 0;
			int[] putArr = new int[a.length];
			for (int i = a.length - 1; i >= 0; i--) {
				// 在反轉數字
				System.out.println("j= " + j);
				if (a[i] == 0) {
					putArr[j] = 1;
					j++;
				} else if (a[i] == 1) {
					putArr[j] = 0;
					j++;
				}
			}
			System.out.println("反轉後: " + Arrays.toString(putArr));
			System.out.println("---------------------");
			ans[num] = putArr;
			num++;
		}

		return ans;

	}

}
