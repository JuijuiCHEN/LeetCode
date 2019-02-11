package com.test.question509;

/* 費式數列計算公式 */
public class FibonacciNumber {

	public static void main(String[] args) {
		int N = 4;
		System.out.println("answer:" + fibonacci(N));
	}

	// 公式
	public static int fibonacci(int n) {
		if (n < 2) {
			return n;
		} else {
			int[] ans = new int[n];
			ans[0] = 1;
			ans[1] = 2;
			for (int i = 2; i < n; i++) {
				ans[i] = ans[i - 1] + ans[i - 2];
				// ans[2] = 3 = ans[1] + ans[0]
				// ans[3] = 5 = ans[2] + ans[1]
			}
			return ans[n - 1]; // ans[3] = 5
		}
	}

}
