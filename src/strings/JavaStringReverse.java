package strings;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String A=sc.next();

		if (A.length() > 50) {
			System.out.println("input not allowed");
			return;
		}

		palindrono(A);
	}

	private static void palindrono(String input) {
		String B = input.toLowerCase();
		String bReversed = new StringBuilder(B).reverse().toString();

		if (B.equals(bReversed)) {
			System.out.println("Yes");
			return;
		}

		System.out.println("No");
	}
}


