package com.test.question500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 返回在鍵盤中輸出為同一行的字串。
 */
public class KeyboardRow {

	public static void main(String[] args) {
		String[] words = { "Hello", "Alaska", "Dad", "Peace" };
		System.out.println("answer:" + Arrays.asList(findWords(words)));
	}

	public static String[] findWords(String[] words) {
		Set<Character> top = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
		Set<Character> mid = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
//		Set<Character> bottom = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

		List<String> list = new ArrayList<>();
		for (String word : words) {
			String wrd = word;
			word = word.toLowerCase();
			int count = 0;
			
			for (char cell : word.toCharArray()) {
				if (top.contains(cell)) {
					if (count > 1) {
						count = -1;
						break;
					}
					count = 1;
				} else if (mid.contains(cell)) {
					if (count == 1 || count == 3) {
						count = -1;
						break;
					}
					count = 2;
				} else {
					if (count == 1 || count == 2) {
						count = -1;
						break;
					}
					count = 3;
				}

			}
			if (count != -1) {
				list.add(wrd);
			}

		}
		String[] ans = list.toArray(new String[list.size()]);

		return ans;
	}

}
