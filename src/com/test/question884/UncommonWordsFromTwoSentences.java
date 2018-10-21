package com.test.question884;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * 做出 String[] uncommonFromSentences(String A, String B) 方法，
 * 比對 A 和 B 的字串，將不同的字放入陣列回傳 。
 */

public class UncommonWordsFromTwoSentences {

	public static void main(String[] args) {
		String A = "this apple is sweet t";
		String B = "this apple is sour";
		System.out.println(Arrays.toString(uncommonFromSentences(A, B)));
	}

	public static String[] uncommonFromSentences(String A, String B) {

		String[] arr = (A + " " + B).split(" ");
		Map<String, Integer> map = new HashMap<>();

		for (String str : arr) {
			// 檢查這個key是不是已經在map裡了
			if (map.containsKey(str)) { // 是就+1
				map.put(str, map.get(str) + 1);
			} else { // 不是就放1
				map.put(str, 1);
			}
		}
		
		System.out.println(map);

		// 如果value=1 就放到set裡
		Set<String> set = new HashSet<>();

		for (String key : map.keySet()) {
			if (map.get(key) == 1) {
				set.add(key);
			}
		}

		// set轉string[]
		String[] ans = set.toArray(new String[0]);

		return ans;
	}

}
