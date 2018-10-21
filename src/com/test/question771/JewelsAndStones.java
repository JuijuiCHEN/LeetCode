package com.test.question771;

/*
 * 做出需傳入2個字串參數J、S的numJewelsInStones()方法，
 * J裡面是個別寶石的名稱、S是我擁有的所有寶石和石頭的名稱，"A"和"a"大小寫是有區分的各為兩種不同物品..以此類推
 * 回傳總共有幾顆寶石。
 */
public class JewelsAndStones {

	public static void main(String[] args) {
		String J = "AaC";
		String S = "Aaabbbc";

		System.out.println(numJewelsInStones(J, S));
	}

	public static int numJewelsInStones(String J, String S) {

		if (J.length() == 0 || S.length() == 0) {
			return 0;
		}

		String[] splitJ = J.split("");
		String[] splitS = S.split("");
		int count = 0;

		for (int i = 0; i < splitS.length; i++) {
			for (int j = 0; j < splitJ.length; j++) {
				if (splitS[i].equals(splitJ[j])) {
					count += 1;
				}
			}
		}

		return count;
	}

}
