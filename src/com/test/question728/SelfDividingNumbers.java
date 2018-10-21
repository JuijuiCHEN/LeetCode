package com.test.question728;

import java.util.ArrayList;
import java.util.List;

/*
 * 做出 List<Integer> selfDividingNumbers(int left, int right) 方法
 * left必須 < rigth
 * 須回傳 left ~ rigth 自分割數可被整除的，不包含0
 * 自分割數: ex. 128 % 1 = 0, 128 % 2 = 0, 128 % 8 = 0 
 */

public class SelfDividingNumbers {

	public static void main(String[] args) {
		int left = 66;
		int right = 708;
		List<Integer> list = selfDividingNumbers(left, right);

		for (Integer num : list) {
			System.out.print(num + " ");
		}
	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		String numS;
		int numI;

		if (left > right) {
			return list;
		}

		for (int i = left; i <= right; i++) {
			numS = "" + i;
			System.out.println("numS= " + numS);

			// 個位數以上的數字切割
			String[] numArr = numS.split("");
			boolean sd = true;

			for (String str : numArr) {
				numI = Integer.parseInt(str);
				System.out.println("numI= " + numI);

				if (numI == 0 || i % numI != 0 ) {
					sd = false;
					break;
				}
			}

			if (sd) {
				list.add(i);
			}
		}
		return list;
	}
}
