package com.test.question136;

import java.util.HashSet;
import java.util.Set;

/*
 * 返回不重複的字符。
 */
public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 2, 1, 1, 3 };
		 System.out.println("answer:" + singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		Set<Integer> ans = new HashSet<>();
		Set<Integer> check = new HashSet<>();

		for (int key : nums) {
			if (ans.contains(key)) {
				ans.remove(key);
				check.add(key); // 將重複值收集起來
			} else {
				ans.add(key);
			}
		}

		// 防止重複的單數，故在檢查一次
		ans.removeAll(check);

		return ans.toArray(new Integer[1])[0];
	}

}
