package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		if (n < 1 || n > 4000) {
			System.out.println("Input not allowed!");
			return;
		}

		List<Integer> list = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			list.add(i, num);
		}

		int queries = in.nextInt();
		if (queries < 1 || queries > 4000) {
			System.out.println("Input not allowed!");
			return;
		}

		for (int i = 0; i < queries; i++) {
			String method = in.next();

			if (method.equalsIgnoreCase("insert")) {
				int x = in.nextInt();
				int y = in.nextInt();
				list.add(x, y);
			} else if (method.equalsIgnoreCase("delete")) {
				int x = in.nextInt();
				list.remove(x);
			} else {
				System.out.println("Method not allowed!");
			}
		}

		list.forEach(v -> System.out.printf("%s ", v));
	}
}
