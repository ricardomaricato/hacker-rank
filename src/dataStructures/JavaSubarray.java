package dataStructures;

import java.util.Scanner;

public class JavaSubarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];

		if (n < 1 || n > 100) {
			System.out.println("Input not allowed!");
		}

		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			array[i] = value;
			if (value < -10000 || value > 10000) {
				System.out.println("Input not allowed!");
			}
		}

		int count = 0;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {

			for (int j = i; j < array.length; j++) {
				if (j > i) {
					sum += array[j];
				} else {
					sum = array[i];
				}

				if (sum < 0)
					count++;
			}

			sum = 0;
		}
		System.out.println(count);
	}
}
