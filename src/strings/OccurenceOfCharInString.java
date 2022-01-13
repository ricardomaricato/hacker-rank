package strings;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharInString {
	static void characterCount(String inputString, String input2)
	{
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		charCountMap.forEach((key, value) -> System.out.println(key + " " + value));
		System.out.println("=====");

		HashMap<Character, Integer> charCountMap2 = new HashMap<>();

		char[] strArray2 = input2.toCharArray();

		for (char c : strArray2) {
			if (charCountMap2.containsKey(c)) {
				charCountMap2.put(c, charCountMap2.get(c) + 1);
			} else {
				charCountMap2.put(c, 1);
			}
		}

//		charCountMap2.forEach((key, value) -> System.out.println(key + " " + value));
		for (Map.Entry entry : charCountMap2.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		if (!charCountMap.equals(charCountMap2)) {
			System.out.println("Not Anagram");
			return;
		}
		System.out.println("Anagram");
	}

	public static void main(String[] args)
	{
		String str = "hello";
		String str2 = "hello";
		characterCount(str, str2);
	}
}
