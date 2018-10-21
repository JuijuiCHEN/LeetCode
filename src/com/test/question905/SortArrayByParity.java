package com.test.question905;

/*
 * 做出 int[] sortArrayByParity(int[] A) 方法
 * 返回所有偶數，後面接所有奇數組成的 int[] A
 * 可返回任何滿足條件的答案陣列。
 */
public class SortArrayByParity {

	public static void main(String[] args) {
		int[] A = { 3, 1, 2, 4 };
		int[] B = sortArrayByParity(A);
		for (int b : B) {
			System.out.print(b);
		}
	}

	public static int[] sortArrayByParity(int[] A) {
		int[] b = new int[A.length];
		int num = 0;

		for (int a : A) {
			System.out.println("a= " + a);
			if (a % 2 == 0) { // 是偶數
				b[num] = a;
				num++;
			}
		}

		for (int a : A) {
			if (a % 2 != 0) { // 是奇數
				b[num] = a;
				num++;
			}
		}

		return b;

	}

}
