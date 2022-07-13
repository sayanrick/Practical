abstract class AbstractClass {
	abstract void area();
}
class Rectangle2 extends AbstractClass{  
void area(){
	System.out.println("Area of rectangle is :- width x length");
	}  
}  
class Circle extends AbstractClass{  
void area(){
	System.out.println("Area of circle is :- 3.14 * r * r");
	}  
}  
class Triangle extends AbstractClass{  
void area(){
	System.out.println("Area of triangle is :- 0.5 * (base * height)");
	}  
}

class Square2 extends AbstractClass{  
void area(){
	System.out.println("Area of square is :- area * area");
	}  
}

class OG{  
public static void main(String args[]){ 
	
 AbstractClass ob = new Rectangle();  
 ob.area();
 AbstractClass obj = new Rectangle();  
 obj.area();
 
 AbstractClass obj1 = new Circle();  
 obj1.area();
 
 AbstractClass obj2 = new Triangle();  
 obj2.area();
 
 
 AbstractClass obj3 = new Square2();  
 obj3.area();
 
}
}

