package com.test.question657;

/*
 *  機器人從0開始，給予一系列動作，判斷機器人完成動作後是否在0結束。
 *  動作為 R(右)、L(左)、U(上)、D(下)
 *  做出需傳入動作為參數的judgeCircle()方法，回傳是否在原點結束。
 */
public class RobotReturnToOrigin {

	public static void main(String[] args) {
		String moves = "LL";
		System.out.println(judgeCircle(moves));
		System.out.println(judgeCircle2(moves));
		
	}

	// 解法1
	public static boolean judgeCircle(String moves) {

		int[] count = new int[90];

		// 迴圈一一跑 moves 的字符轉 CharArray
		for (char ch : moves.toCharArray())
			// 將相同字符做加總
			count[ch] += 1;

		// 下的數量 != 上的數量 || 左的數量 != 右的數量 都返回 false
		if (count['D'] != count['U'] || count['L'] != count['R'])
			return false;

		return true;
	}
	
	// 解法2
	public static boolean judgeCircle2(String moves) {
		
		int u = 0;
		int d = 0;
		int r = 0;
		int l = 0;

		for (int i = 0; i < moves.length(); i++) {
			char ch = moves.charAt(i);
			if (ch == 'U') {
				u++;
			}
			if (ch == 'D') {
				d++;
			}
			if (ch == 'R') {
				r++;
			}
			if (ch == 'L') {
				l++;
			}
		}
		
		if (u == d && r == l) {
			return true;
		} else {
			return false;
		}
		
	}

}
