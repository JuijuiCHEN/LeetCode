package com.test.question485;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * 找出連號數字1的最大長度。
 *
 */
public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		 int[] nums = { 1, 1, 0, 1, 1, 1 };
		System.out.println("answer:" + findMaxConsecutiveOnes(nums));
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		List<Integer> ansList = new ArrayList<Integer>();
		int ans = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				ans++;
			} else if (nums[i] == 0) {
				if (ans != 0) {
					ansList.add(ans);
				}
				ans = 0;
			} else {
				return 0;
			}

			// 最後一個要加進list
			if (i == nums.length - 1) {
				ansList.add(ans);
			}
		}

		return Collections.max(ansList);
	}

}
