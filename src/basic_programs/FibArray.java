package src.basic_programs;
import java.util.Scanner;
public class FibArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements array");
		int n = scan.nextInt();
		scan.close();
		int arr[] = new int[n];
		arr[0] = 0;
		if(n == 1) {
			System.out.print(arr[0]);
		}
		else {
			arr[1] = 1;
			if(n == 1) {
				System.out.print(arr[0] + " " + arr[1]);
			}
			else {
				System.out.print(arr[0] + " " + arr[1] );
				for(int i =2; i< n;i++) {
					arr[i] = arr[i-1] + arr[i-2];
					System.out.print(" " +arr[i]);
				}System.out.println();
				
			}
		}
	}

}
