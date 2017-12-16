package src.basic_programs;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		int n,dig,rev=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		n = scan.nextInt();
		int n1 = n;
		scan.close();
		while(n!=0) {
			dig = n % 10;
			rev = rev * 10 + dig;
			n = n/10;
		}
		if(n1 == rev) {
			System.out.println("Entered number is palindrome");
		}
		else {
			System.out.println("Enetered number is not a palindrome");
		}
		
	}

}
