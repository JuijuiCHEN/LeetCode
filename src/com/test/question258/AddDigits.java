package com.test.question258;

/*
 * 相加數字(十位、百位數都要先切割)，直到個位數。
 */
public class AddDigits {

	public static void main(String[] args) {
		int num = 38;
		System.out.println("answer:" + addDigits(num));
	}

	public static int addDigits(int num) {
		int ans = 0;

		// 拿到切割後的數字
		String[] strArr = numSplit(num);

		while (strArr.length >= 2) {
			int sum = 0;
			for (String string : strArr) {
				int curNum = Integer.parseInt(string);
				sum += curNum;
			}
			strArr = numSplit(sum);
		}

		if (strArr.length == 1) {
			for (String string : strArr) {
				ans = Integer.parseInt(string);
			}
		}

		return ans;
	}

	/* 切割數字 */
	private static String[] numSplit(int num) {
		String[] numArray = Integer.toString(num).split("");
		return numArray;
	}

}
