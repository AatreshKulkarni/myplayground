package basic_programs;

import java.util.Scanner;

public class FibNum {

	public static void main(String[] args) {
		int fib1,fib2,fib3,n;
		fib1 = 0; 
		fib2 = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		n = scan.nextInt();
		scan.close();
		if(n == 1) {
			System.out.println(fib1);
		}
		else if(n == 2) {
			System.out.println(fib1 + " " + fib2);
		}
		else {
			System.out.print(fib1 + " " + fib2);
			for(int i=2;i<n;i++) {
				fib3 = fib1 + fib2;
				System.out.print(" " + fib3);
				fib1 = fib2;
				fib2 = fib3;
				
				
			}
			System.out.println();
			
		}
		
	}

}
