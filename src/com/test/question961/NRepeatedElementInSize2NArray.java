package com.test.question961;

/*
 * 在大小為2N的陣列A中，存在N + 1個唯一元素，並且這些元素中的一個元素重複N次。
 * 返回重複N次的元素。
 */
public class NRepeatedElementInSize2NArray {

	public static void main(String[] args) {
		int[] a = { 6, 1, 5, 2, 5, 3, 5, 4 };
		System.out.println("answer:" + repeatedNTimes(a));
	}

	public static int repeatedNTimes(int[] A) {

		// 必須為偶數
		if (A.length % 2 != 0) {
			return 0;
		}

		for (int i = A.length - 1; i > 0; i--) {
			System.out.println("i值=" + A[i] + ",i=" + i);
			for (int a = 0; a < A.length; a++) {
				System.out.println("a值=" + A[a] + ",a=" + a);
				if (i == a) {
					continue;
				} else if (A[a] == A[i]) {
					return A[a];
				} else {
					continue;
				}
			}
		}

		return 0;
	}

}
