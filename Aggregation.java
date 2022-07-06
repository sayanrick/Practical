
public class Aggregation {
	int square(int n) {
		return n*n;
	}

}

class Circle {
//	Aggregation ag;
	double pi = 3.14;
	double area (int radius) {
		Aggregation ag = new Aggregation();
		int psquare = ag.square(radius);
		return pi*psquare;
	}
public static void main(String[] args) {
	Circle c = new Circle();
	double result = c.area(5);
	System.out.println(result);
}
}
