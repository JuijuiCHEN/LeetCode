package com.test.question821;

import java.util.Arrays;

/*
 * 給定一個String S 和一個Char C，
 * 返回一個整數數組，表示C與字符串中字符的最短距離。
 * ex. 輸入： S = "loveleetcode" , C = 'e' 
 *     輸出： [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 */
public class ShortestDistanceToACharacter {

	public static void main(String[] args) {
		String s = "loveleetcode";
		char c = 'e';
		System.out.println("answer:" + Arrays.toString(shortestToChar(s, c)));

	}

	public static int[] shortestToChar(String S, char C) {
		int N = S.length();
		int[] ans = new int[N];
		int prev = Integer.MIN_VALUE / 2;

		for (int i = 0; i < N; ++i) {
			if (S.charAt(i) == C)
				prev = i;
			ans[i] = i - prev;
		}

		prev = Integer.MAX_VALUE / 2;
		for (int i = N - 1; i >= 0; --i) {
			if (S.charAt(i) == C)
				prev = i;
			ans[i] = Math.min(ans[i], prev - i);
		}
		return ans;
	}

}
