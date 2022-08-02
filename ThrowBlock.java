package Exception_Handling;

public class ThrowBlock {
	public static void check(int age) {
		if (age<18) {
			throw new ArithmeticException("not eligible");
		}
		else {
			System.out.println("eligible");
		}
	}

	public static void main(String[] args) {
		check(15);

	}

}