
public interface TestInterface {
	void printH();

}

interface TestInterface2 {
	void printM();

}

class A4 implements TestInterface {
	public void printH() {
		System.out.print("Hello guys....");
	}
	public void printM() {
		System.out.print("Hello guys....");
	}
	
	public static void main(String[] args) {
		A4 obj = new A4();
		obj.printH();
		obj.printM();
	}
}
