package strings;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubstringComparisons {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		if (s.length() < 1 || s.length() > 1000) {
			System.out.println("Input not allowed!");
			return "";
		}

		int arraySize = s.length() - k + 1;
		String[] substringsToComparisons = new String[arraySize];

		for (int i = 0; i < arraySize; i++) {
			substringsToComparisons[i] = s.substring(i, i + k);
		}

		java.util.Arrays.sort(substringsToComparisons);

		smallest = substringsToComparisons[0];
		largest = substringsToComparisons[arraySize - 1];

		return smallest + "\n" + largest;
	}
}
