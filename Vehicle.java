
public class Vehicle {
	void run() {
		System.out.println("Running mode is on");
	}
}
	
	class Bike extends Vehicle {
		void features () {
			System.out.println("well executed features");
		}
		
	}
	
//	class BMW extends Bike {
//		void speed() {
//			System.out.println("Very high speed");
//		}
//	}
	
	class Activa extends Vehicle {
		void capacity() {
			System.out.println("More Capacity");
		}
	}
	
	class Testinginheritance {
		public static void main(String[] args) {
			Activa a = new Activa();
			a.run();
//			b.features();
//			b.speed();
			a.capacity();
			
		}
	}

