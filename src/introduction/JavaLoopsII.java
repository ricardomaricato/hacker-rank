package introduction;

import java.util.Scanner;

public class JavaLoopsII {
	public static void main(String []argh){
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();

		if (t < 0 || t > 500) {
			System.out.println("Number of interactions not allowed.");
			return;
		}

		for(int i=0;i<t;i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			if (a < 0 || a > 50 || b < 0 || b > 50 || n < 1 || n > 15) {
				System.out.println("Input not allowed");
				break;
			} else {
				int product = 0;
				int sum = 0;
				for (int c = 0; c < n; c++) {
					product += (int) (Math.pow(2, c) * b);
					sum = a + product;
					System.out.printf("%d ", sum);
				}
				System.out.print("\n");
			}
		}
		in.close();
	}
}

