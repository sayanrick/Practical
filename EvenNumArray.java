package arrays;

public class EvenNumArray {
	public static void main(String[] args) {
		int a[] = {10, 22, 33, 44, 13, 44, 21, 45, 66, 77};
		printEvenNum(a);
		
	}
	
	static void printEvenNum(int[] arr) {
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
