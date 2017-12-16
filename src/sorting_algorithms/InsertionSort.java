package src.sorting_algorithms;
import java.util.*;
public class InsertionSort {
	void insertSort(int[] a,int n) {
		int i,item,j;
		
		for(i=1;i<n;i++) {
			item = a[i];
			j = i-1;
			while(j>=0 && a[j]>item) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = item;
		}
	}
	
	
	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elemets in an array");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elemets in an array");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("Before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		is.insertSort(a,n);
		System.out.println("After sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

}
