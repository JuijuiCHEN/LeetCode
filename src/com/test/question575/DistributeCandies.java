package com.test.question575;

import java.util.HashSet;
import java.util.Set;
/*
 * 給定具有偶數長度的整數數組，其中該數組中的不同數字表示不同種類的糖果，每個數字表示相應種類的一種糖果。
 * 需要將這些糖果平均分配給兄弟、姐妹，返回兄弟、姊妹可以獲得的糖果種類的最大數量。
 */
public class DistributeCandies {

	public static void main(String[] args) {

		int[] candy = { 1, 1, 2, 3};
		System.out.println(distributeCandies(candy));
	}

	public static int distributeCandies(int[] candies) {

		// 必須為偶數
		if (candies.length % 2 != 0) {
			return 0;
		}
		
		Set<Integer> type = new HashSet<Integer>();
		
		for (int c : candies) {
			type.add(c);
		}
		
		// candy種類 和 (candy數量/兩人) 取最小值
		int a = Math.min(type.size(), (candies.length / 2));
		return a;

	}

}
