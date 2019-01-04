package com.test.question929;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

	public static void main(String[] args) {
		String[] emails = { "test.email+alex@leetcode.com", //
				"test.e.mail+bob.cathy@leetcode.com", //
				"testemail+david@lee.tcode.com" };
		System.out.println("answer:" + numUniqueEmails(emails));
	}

	public static int numUniqueEmails(String[] emails) {
		Set<String> total = new HashSet<String>();
		StringBuffer newBuffer = null;
		String curBack = null;

		// 總長度必須大於1, 小於等於100
		if (emails.length <= 1 && emails.length >= 100) {
			return 0;
		}
		
		for (String email : emails) {
			String curFront = email.substring(0, email.indexOf("@")); // @前
			curBack = email.substring(email.indexOf("@"), email.length()); // @後
			StringBuffer sBuffer = new StringBuffer(curFront);
			
			// 單個長度必須大於1, 小於等於100
			if (email.length() <= 1 && email.length() >= 100) {
				return 0;
			}

			// email 有 "+" 進來
			if (sBuffer.indexOf("+") != -1) {
				newBuffer = new StringBuffer(removePlus(sBuffer, email));
			}

			// email 有 "." 進來
			if (newBuffer.indexOf(".") != -1) {
				total.add(removePoint(newBuffer).append(curBack).toString());
			} else {
				total.add(newBuffer.append(curBack).toString());
			}
			
		}

		return total.size();
	}

	/* 去除多餘的"+" */
	private static StringBuffer removePlus(StringBuffer sBuffer, String email) {
		return sBuffer.delete(email.indexOf("+"), email.length());
	}

	/* 去除多餘的"." */
	private static StringBuffer removePoint(StringBuffer sBuffer) {
		int startNum;
		StringBuffer cur = new StringBuffer();
		while (sBuffer.indexOf(".") != -1) {
			startNum = sBuffer.indexOf(".");
			cur = sBuffer.delete(startNum, startNum + 1);
		}
		return cur;
	}
}
