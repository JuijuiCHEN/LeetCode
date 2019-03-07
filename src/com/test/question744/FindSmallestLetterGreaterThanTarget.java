package com.test.question744;

/*
 * 給定letters僅包含小寫字母的排序字符列表，並給定目標字母target，找到列表中大於target的最小元素。
 * ex.  letters = {'c', 'f', 'j'}; 
 * 		target = 'a';
 * 		// 距離a最小元素是'c' 輸出'c'
 */
public class FindSmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		char[] letters = { 'a', 'e', 'h' };
		char target = 'z';
		System.out.println("answer:" + nextGreatestLetter(letters, target));

	}

	public static char nextGreatestLetter(char[] letters, char target) {

		for (char c : letters) {
			if (c > target)
				return c;
		}

		return letters[0];

	}

}
