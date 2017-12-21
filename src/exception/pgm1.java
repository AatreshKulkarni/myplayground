package src.exception;

import java.util.Scanner;

public class pgm1 {

	public static void main(String[] args) {
		System.out.println("Entering main()");
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = scan.nextInt();
		System.out.println("Enter the value of b");
		b = scan.nextInt();
		scan.close();
		try {
			c = a / b;
			System.out.println("Div result is " + c );
		} catch (Exception e) {
		System.out.println("Problem resolved in main()");
		}
		System.out.println("Exiting main()");
	}

}
