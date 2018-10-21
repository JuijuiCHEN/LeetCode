package com.test.question557;

/*
 * 做出 String reverseWords(String s) 方法，
 * 需要反轉句子中每個單詞中的字符順序，同時仍保留空格和初始單詞順序，並返回。
 * 在字符串中，每個單詞由單個空格分隔，並且字符串中不會有任何額外的空格。
 */
public class ReverseWordsInAStringIII {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";

		// 應返回 "s'teL ekat edoCteeL tsetnoc"
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {
		String ans = "";
		String[] arr = s.split(" ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("s= " + arr[i]);
			
			StringBuilder sb = new StringBuilder(arr[i]);
			if (i == 0) {
				ans += (String) sb.reverse().toString();
			} else {
				ans += " " + (String) sb.reverse().toString();
			}
		}
		return ans;
	}

}
