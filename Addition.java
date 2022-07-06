
public class Addition {
	static int add(int a, int b) {
		return (a+b);
	}
	
	static double add(double a, double b) {
		return (a+b);
	}
		
	static int add(int a, int b, int c) {
		return a+b+c;
	}


}


class Overloading {
	public static void main(String[] args) {
		System.out.println(Addition.add(10,20));
		System.out.println(Addition.add(22.22, 11.44));
		System.out.println(Addition.add(211, 223, 444));
	}
}