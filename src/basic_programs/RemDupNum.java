package basic_programs;

public class RemDupNum {

	public static void main(String[] args) {
		int arr[] = {10,10,20,45,30,40,20,30,40};
		int m = arr.length;
		for (int i = 0; i < m ; i++) {
			for (int j = i+1; j < m; j++) {
				if(arr[i] == arr[j]) {
					
					while(j!=m-1) {
						arr[j]=arr[j+1];
						j++;
					}
					m--;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			System.out.println(arr[i]);
		}
	}

}
