package com.test.question788;
/*
 * 如果每個數字在旋轉後仍為數字，則數字有效。
 * 0,1,8旋轉自己
 * 2和5、6和9互相旋轉
 * 3,4,7無法反轉即為無效數字
 * 給一個int，計算出int範圍內反轉後有幾個是有效的數字。
 * p.s 1和10不是有效數字，因為在旋轉後保持不變。
 */
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
