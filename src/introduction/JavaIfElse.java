package introduction;

import java.util.Scanner;

public class JavaIfElse {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		scanner.close();

		if ((N % 2 != 0) || (N < 1) || (N > 100)) {
			System.out.println("Weird");
			return;
		}

		if (N >= 2 && N <= 5) {
			System.out.println("Not Weird");
			return;
		}

		if (N >= 6 && N <= 20) {
			System.out.println("Weird");
			return;
		}

		if (N > 20) {
			System.out.println("Not Weird");
		}

	}
}
