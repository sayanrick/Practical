
public class A {
	String a = "String declared in class A";
	void method1() {
		System.out.println("This is a method from class A");
	}

}

class B extends A {
	String a = "String declared in class B";
	void method1() {
		System.out.println("This is a method from class A");
	}
	void method2() {
		System.out.println("This is a method from class B");
	}

}
class C extends B {
	String a = "String declared in class C";
	void method3() {
		System.out.println("This is a method from class C");
	}
	
	void display() {
		System.out.println("String: " + super.a);
	}
}

class Testinggg {
	public static void main(String[] args) {
		C obj = new C();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.display();
		
	}
}
