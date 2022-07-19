import java.util.Arrays;

public class ArrayMethod {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(get()));  // using inbuilt method toString of arrays to print the array
		
	}
	
	static int[] get() { // method which returns an array
		return new int[] {10, 16, 19};
	}

}


