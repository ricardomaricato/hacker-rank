package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopsI {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bufferedReader.readLine().trim());

		bufferedReader.close();

		if (N < 2 || N > 20) {
			System.out.println("Input not allowed");
			return;
		}

		for (int i = 1; i <= 10; i++) {
			int result = N * i;
			System.out.println(N + " x " + i + " = " + result);
		}
	}
}

