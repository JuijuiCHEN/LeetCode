package com.test.question344;
/*
 * 做出 String reverseString(String s) 方法
 * 返回該反轉後字串。
 */
public class ReverseString {

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(reverseString(s));
	}

	public static String reverseString(String s) {
		StringBuilder str = new StringBuilder(s);
		return str.reverse().toString();
	}
}
