package sorting_algorithms;

public class BubbleSort {
	
    void bubblesort(int[] arr,int n) {
		
		for(int k=0;k<n-1;k++) {
			int flag = 0;
			for(int i=0;i<n-k-1;i++) {
				if(arr[i]>arr[i+1]) {
				int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0) {
				return;
			}
		}
	}
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int arr[] = {2,7,4,1,5,3};
		int n = arr.length;
		bs.bubblesort(arr, n);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
