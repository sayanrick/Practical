package arrays;

public class SumMaxMinAvg {
	
	public static void main(String[] args) {
		int a[] = {10, 22, 33, 44, 12, 44, 21, 45, 66, 77};
		
		System.out.println(sumOfArray(a));
		System.out.println(maxInAnArray(a));
		System.out.println(minInAnArray(a));
		System.out.println(avgInAnArray(a));
	}
	
	static int sumOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	static int maxInAnArray(int[] a) {
		int max = a[0];
		for (int i = 1; i<a.length; i++) {
			if(max<a[i])
				max = a[i];
	}
		return max;
	}
	
	static int minInAnArray(int[] a) {
		int min = a[0];
		for (int i = 1; i<a.length; i++) {
			if(min>a[i])
				min = a[i];
	}
		return min;
	}
	
	static int avgInAnArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}
}
