
public class Inheritanceisa {
	float salary = 40000;

}

class inherit extends Inheritanceisa {
	int bonus = 10000;
	public static void main(String[] args) {
		inherit obj = new inherit();
		System.out.println("Salary is:- " + obj.salary);
		System.out.println("Bonus is:- " + obj.bonus);
	}
}
