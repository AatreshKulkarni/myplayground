package src.exception;

import java.util.Scanner;

public class pgm2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		int i;
		System.out.println("Enter the array elemnts");
		for( i=0;i<=4;i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Array elemnts are");
		try {
			for(i=0;i<=5;i++) {
				System.out.println(a[i]);
			}
		} catch (Exception e) {
			System.out.println("Problem resolved in main()");
		}
		
		scan.close();
	}

}
