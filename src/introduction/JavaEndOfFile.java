package introduction;

import java.util.Scanner;

public class JavaEndOfFile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int index = 1;
		while (scanner.hasNext()) {
			String s = scanner.nextLine();
			System.out.printf("%d %s\n", index, s);
			index++;
		}
	}
}
