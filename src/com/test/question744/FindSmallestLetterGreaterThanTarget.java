package com.test.question744;

public class FindSmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		char[] letters = { 'a', 'e', 'h' };
		char target = 'z';
		System.out.println(nextGreatestLetter(letters, target));

	}

	public static char nextGreatestLetter(char[] letters, char target) {

		for (char c : letters) {
			if (c > target)
				return c;
		}
		
		return letters[0];

	}

}
