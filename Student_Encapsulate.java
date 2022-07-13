
public class Student_Encapsulate {
	private String name;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}

class Test_encapsulation {
	public static void main(String[] args) {
		Student_Encapsulate obj = new Student_Encapsulate();
		obj.setName("Sayan"); // setting the value
		System.out.println(obj.getName()); // getting the value
	}
}
