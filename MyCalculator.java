package Exception_Handling;

public class MyCalculator {
	public static void main(String args[]) throws IntegerNumException {
		System.out.println(power(12,-3));
	}
	private static long power(int n, int p) throws IntegerNumException{
		if(n<0 || p<0) {
			throw new IntegerNumException("n and p should not be negative", new RuntimeException());
		}
		else if (n==0 && p==0) {
			throw new IntegerNumException("n and p should not be zer", new RuntimeException());
	
		}
		else {
			return (long) Math.pow(n, p);
		}
	}
}

class IntegerNumException extends Exception {
	public IntegerNumException(String s, Throwable cause) {
		super(s, cause);
	}
}


