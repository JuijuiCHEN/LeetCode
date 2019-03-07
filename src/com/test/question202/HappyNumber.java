package com.test.question202;

import java.util.HashSet;

/*
 * 幸運數字為1
 * 迴圈將數字拆開後平方相加，結果為幸運數字則返回true
 */
public class HappyNumber {

	public static void main(String[] args) {
		int n = 17;
		System.out.println("answer:" + isHappy(n));

	}

	public static boolean isHappy(int n) {

		// 用於保存中間出現的结果
		HashSet<Integer> sets = new HashSet<>();

		// n不為1，並且n的值不能重複出現，否則會死循環
		while (n != 1) {
			if (sets.contains(n)) {
				break;
			}
			
			sets.add(n);

			int newN = 0;
			while (n != 0) {
				int val = n % 10;
				newN += val * val;
				n /= 10;
			}
			n = newN;
		}

		if (n == 1) {
			return true;
		}

		return false;

	}

}
