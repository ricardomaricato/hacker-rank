package introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

	static boolean flag = true;
	static int B, H;
	static {
		try {
			Scanner sc = new Scanner(System.in);
			B = sc.nextInt();
			H = sc.nextInt();
			if (B <= 0 || B > 100 || H <= 0 || H > 100) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		} catch(Exception e){
			System.out.println(e);
			System.exit(0);
		}

	}
	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}//end of main

}//end of class

