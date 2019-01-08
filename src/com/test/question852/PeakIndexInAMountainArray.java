package com.test.question852;

/*
 * 假設數組內字串可組成一座山峰，即數組成立
 * ex. {1,2,3,2,0} 索引2(字符3) 為最高峰，成立
 * 返回山峰最高索引值。
 */
public class PeakIndexInAMountainArray {

	public static void main(String[] args) {
		int[] A = { 0, 10, 5, 2 };
		System.out.println("answer:" + peakIndexInMountainArray(A));
	}

	public static int peakIndexInMountainArray(int[] A) {
		int ans = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > A[ans]) {
				ans = i;
			}
		}

		return ans;
	}

}
