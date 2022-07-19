package arrays;

public class SumOfOddNumArray {
	public static void main(String[] args) {
		int a[] = {10, 22, 33, 44, 12, 44, 21, 45, 66, 77};
		System.out.println(sumOfOdd(a));
	}
	
	static int sumOfOdd(int n[]) {
		int oddSum = 0;
		for (int i=0; i<n.length; i++) {
			if (n[i] % 2 != 0) {
				oddSum += n[i];
			}
			
		}
		return oddSum;
	}

}
