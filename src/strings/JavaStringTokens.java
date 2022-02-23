package strings;

import java.util.Scanner;

public class JavaStringTokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		if (s.length() == 0 || s.length() > 400000) {
			System.out.println("0");
			return;
		}

		String[] strings = s.split("[!,?._'@\\s]+");
		System.out.println(strings.length);
		for (String string : strings) {
			System.out.println(string);
		}
		scan.close();
	}
}

