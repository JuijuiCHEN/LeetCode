package com.test.question788;

public class RotatedDigits {

	public static void main(String[] args) {
		int n = 10;
		System.out.println("answer:" + rotatedDigits(n));
	}

	public static int rotatedDigits(int N) {
		// 標記個位數有效數字
		// 標記完如下:
		// 標記: 1 1 2 0 0 2 2 0 1 2
		// 數字: 0 1 2 3 4 5 6 7 8 9
		int[] record = new int[N + 1];
		
		int ans = 0;
		for (int i = 0; i <= N; i++) {
			if (i < 10) {
				if (i == 0 || i == 1 || i == 8) {
					record[i] = 1;
				} else if (i == 2 || i == 5 || i == 6 || i == 9) {
					record[i] = 2;
					ans++;
				}
			} else {
				// 拆分十位數以上數字
				int a = record[i / 10], b = record[i % 10]; 
				if (a == 1 && b == 1) {
					record[i] = 1;
				} else if (a >= 1 && b >= 1) {
					record[i] = 2;
					ans++;
				}
			}
		}

		return ans;
	}

}
