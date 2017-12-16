package src.basic_programs;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n,n1,dig,ans = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		n = scan.nextInt();
		n1 = n;
		scan.close();
		while(n!=0) {
			dig = n % 10;
			ans = ans + (dig * dig * dig);
			n = n/10;
			
		}
		if(n1 == ans) {
			System.out.println("Entered number is Armstrong number");
		}
		else {
			System.out.println("Entered number is not a armstrong number");
		}
	}

}
