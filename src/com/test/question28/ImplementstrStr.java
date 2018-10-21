package com.test.question28;

/*
 * 做出需傳入2個字串參數haystack、needle的strStr()方法，
 * 回傳needle在haystack第幾個位置，如沒有則回傳-1，如為空字串則回傳0
 */
public class ImplementstrStr {
	
	public static void main(String[] args) {
		String haystack = "aac";
		String needle = "c";
		System.out.println(strStr(haystack, needle));
	}
	
	public static int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);
	}
}
