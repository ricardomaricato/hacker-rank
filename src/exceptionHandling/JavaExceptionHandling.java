package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int result = x / y;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (InputMismatchException e) {
			System.out.println(e.getClass().getName());
		}
	}
}
