package com.test.question283;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		 int[] nums = new int[] { 0, 1, 0, 3, 12 };
		moveZeroes(nums);

	}

	public static void moveZeroes(int[] nums) {

		int index = 0;

		// 將!=的數字移到前面
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}

		// 補0
		for (int i = index; i < nums.length; i++) {
			nums[i] = 0;
		}

		 System.out.println(Arrays.toString(nums));
	}

}
