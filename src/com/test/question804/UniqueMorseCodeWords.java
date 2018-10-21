package com.test.question804;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * 做出需傳入一組字串陣列的uniqueMorseRepresentations()方法，
 * 需將該字串陣列內的英文字逐一轉換為摩斯密碼，並各自串聯，
 * 回傳該陣列內有幾種串聯好的摩斯密碼樣式，且不得重複。
 */
public class UniqueMorseCodeWords {

	public static void main(String[] args) {
		String[] words = { "gin", "zen", "gig", "msg" };
		System.out.println(uniqueMorseRepresentations(words));

	}

	public static int uniqueMorseRepresentations(String[] words) {

		// a-z的摩斯密碼
		final String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		HashMap<Integer, String> map = new HashMap<>();

		// a-z對應密碼加到map
		int j = 0;
		for (int i = 97; i <= 122; i++) {
			map.put(i, morse[j]);
			j++;
		}
		// 為了拿到去除重複的密碼
		Set<String> result = new HashSet<>();

		// 遍歷該陣列每個字串
		for (String word : words) {
			StringBuilder sb = new StringBuilder();

			// 遍歷該字串的字符
			for (int i = 0; i < word.length(); i++) {
				
				// 將字符一一取出
				char ch = word.charAt(i);
				int ascii = (int) ch;
				
				// 比對 map 裡的 key 和 ascii 是否一致，true的話 append 至 sb 裡
				if (map.containsKey(ascii)) {
					sb.append(map.get(ascii));
				}
			} 
			result.add(sb.toString());
		}
		return result.size();

	}

}
