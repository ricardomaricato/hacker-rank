package strings;

import java.util.HashMap;
import java.util.Scanner;

public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {
		String aLowerCase = a.toLowerCase();
		String bLowerCase = b.toLowerCase();

		HashMap<Character, Integer> charCountMap = new HashMap<>();
		char[] strArray = aLowerCase.toCharArray();

		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		HashMap<Character, Integer> charCountMap2 = new HashMap<>();
		char[] strArray2 = bLowerCase.toCharArray();

		for (char c : strArray2) {
			if (charCountMap2.containsKey(c)) {
				charCountMap2.put(c, charCountMap2.get(c) + 1);
			} else {
				charCountMap2.put(c, 1);
			}
		}

		return charCountMap.equals(charCountMap2);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();

		if (a.length() < 1 || a.length() > 50 || b.length() < 1 || b.length() > 50) {
			System.out.println("Input not allowed");
			return;
		}

		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
