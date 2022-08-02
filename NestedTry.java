package Exception_Handling;

public class NestedTry {

	public static void main(String[] args) {
		
		try {
			try {
				int i=50/0;
			}
			catch(ArithmeticException e) {
				System.out.println("arithmetic exception");
			}
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("by");

	}

}
