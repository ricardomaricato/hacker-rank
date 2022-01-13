package introduction;

import java.util.Scanner;

public class JavaOutputFormatting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("================================");
		for(int i=0;i<3;i++){
			String s1=sc.next();
			int x=sc.nextInt();
			if (s1.length() > 10 || x < 0 || x > 999) {
				break;
			} else {
				System.out.printf("%-15s%03d\n", s1, x);
			}
		}
		System.out.println("================================");
	}
}
