package com.test.question14;

/*
 * 找出公共前綴字串，如沒有回傳空字串。
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] string = { "flower", "flow", "flight" };
//		String[] string = { "", "b" };
//		String[] string = { "a", "b" };
		System.out.println("answer: " + longestCommonPrefix(string));
	}

	public static String longestCommonPrefix(String[] strs) {
		    if(strs == null || strs.length == 0)    return "";
		    String prefix = strs[0];
		    int i = 1;
		    while(i < strs.length){
		    	// 找出共同前綴字串
		        while(strs[i].indexOf(prefix) != 0)
		        	prefix = prefix.substring(0,prefix.length()-1);
		        i++;
		    }
		    return prefix;
	}

}
