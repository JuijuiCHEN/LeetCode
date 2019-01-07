package com.test.question682;

import java.util.ArrayList;
import java.util.List;

/*
 * 需返回所有回合中可獲得的積分總和。
 * 指令:
 * 整數: 表示這一輪獲得的積分數。
 * "+": 表示在這一輪得到的分數是前兩個回合分數的總和。
 * "C": 表示前一回合無效，應刪除數據。
 * "D": 表示在這一輪得到的分數是前一個回合分數的加倍。
 */
public class BaseballGame {

	public static void main(String[] args) {
		String[] ops = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		System.out.println("answer:" + calPoints(ops));
	}

	private static boolean isInteger(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static int calPoints(String[] ops) {
		int ans = 0;
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < ops.length; i++) {
			String cur = ops[i];

			// 整數
			if (isInteger(cur)) {
				list.add(cur);
			}

			// "+"
			if (cur.equals("+")) {
				int sum = Integer.parseInt(list.get(list.size() - 1)) + Integer.parseInt(list.get(list.size() - 2));
				String sumStr = Integer.toString(sum);
				list.add(sumStr);
			}

			// "C"
			if (cur.equals("C")) {
				list.remove(list.get(list.size() - 1));
			}

			// "D"
			if (cur.equals("D")) {
				String front = Integer.toString(Integer.parseInt(list.get(list.size() - 1)) * 2);
				list.add(front);
			}

		}

		for (String value : list) {
			ans += Integer.parseInt(value);
		}

		return ans;
	}
}
