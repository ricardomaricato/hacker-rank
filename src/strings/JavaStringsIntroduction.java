package strings;

import java.util.Scanner;

public class JavaStringsIntroduction {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		int Alenght = A.length();
		int Blenght = B.length();

		int sum = Alenght + Blenght;
		System.out.println(sum);

		if (isLexicographicallyGreater(A, B)) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

		System.out.println(upperCaseFirst(A) + " " + upperCaseFirst(B));
	}

	private static boolean isLexicographicallyGreater(String A, String B) {
		int i = A.compareTo(B);
		return i <= 0;
	}

	private static String upperCaseFirst(String val) {
		char[] arr = val.toCharArray();
		arr[0] = Character.toUpperCase(arr[0]);
		return new String(arr);
	}
}
