package sorting_algorithms;

public class SelectionSort {

	static void selectionsort(int[] arr,int n) {
		int i,iMin,j;
		for(i=0;i<n-1;i++) {
			iMin = i; 
			for(j=i+1;j<n;j++) {
				if(arr[j]<arr[iMin]) {
					iMin = j;
				}
				int temp = arr[i];
				arr[i] = arr[iMin];
				arr[iMin] = temp;
			}
		}
		
	}
	public static void main(String[] args) {
	//	SelectionSort s= new SelectionSort();
		int arr[] = {2,7,4,1,5,3};
		int n = arr.length;
		selectionsort(arr, n);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
