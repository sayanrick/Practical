package arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
	int a[] = {10, 22, 33, 44, 12, 44, 21, 45, 66, 77};
	reverseArrayprint(a);
	}
	
	
	static void reverseArrayprint(int arr[]) {
		for (int i= 0; i<arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i -1];
			arr[arr.length - i -1] = temp;
		}
		
		for (int p = 0; p < arr.length; p++) {
			System.out.print(arr[p] + " ");
		}
		
	}

}
 