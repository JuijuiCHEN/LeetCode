package com.test.question811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
 * 做出 List<String> subdomainVisits(String[] cpdomains) 方法，
 * cpdomains 的一個字串內 需給予訪問網址數量及網址
 * 回傳所有(需切割)網址訪問數量及網址
 * 假設 "10 yahoo.com" 須回傳  "10 com", "10 yahoo.com"
 */
public class SubdomainVisitCount {

	public static void main(String[] args) {

		 String[] strArr = { "9001 discuss.leetcode.com" };
//		String[] strArr = { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" };
		List<String> list = subdomainVisits(strArr);
		for (String str : list) {
			System.out.println(str);
		}

	}

	public static List<String> subdomainVisits(String[] cpdomains) {

		Map<String, Integer> counts = new HashMap<String, Integer>();
		
		for (String domain : cpdomains) {
			String[] cpinfo = domain.split("\\s+"); // 切割數字和文字(網址)
			String[] frags = cpinfo[1].split("\\."); // 依文字"."切割
			int count = Integer.valueOf(cpinfo[0]); // 將數字字串轉型int
			String cur = "";
			
			for (int i = frags.length - 1; i >= 0; --i) {
				cur = frags[i] + (i < frags.length - 1 ? "." : "") + cur; // 拼接網址
				counts.put(cur, counts.getOrDefault(cur, 0) + count); // 加入網址及數字
			}
			
		}

		List<String> ans = new ArrayList<String>();
		for (String dom : counts.keySet())
			ans.add("" + counts.get(dom) + " " + dom);
		
		
		return ans;

	}

}
