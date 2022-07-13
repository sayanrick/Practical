
import java.util.*;
public class Result {
	private String name;
	private long userId;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public double totalPercentage(double sub1, double sub2, double sub3, double sub4, double sub5) {
		double total = (sub1 + sub2 + sub3 + sub4 + sub5); 
		double avarage = total / 5.0;
		double percentage = (total / 500.0) * 100;
		return percentage;
		
	}
	
	
}

class Encapsulation { 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name, password;
		long userId;
		double sub1,sub2,sub3,sub4,sub5;
		
		System.out.println("Enter name: ");
		name = sc.nextLine();
		
		System.out.println("Enter password: ");
		password = sc.next();
		
		System.out.println("Enter usr id: ");
		userId = sc.nextLong();
		
		
		System.out.println("Enter marks of Math: ");
		sub1 = sc.nextDouble();
		System.out.println("Enter marks of Chemistry: ");
		sub2 = sc.nextDouble();
		System.out.println("Enter marks of Physics: ");
		sub3 = sc.nextDouble();
		System.out.println("Enter marks of Computer Science: ");
		sub4 = sc.nextDouble();
		System.out.println("Enter marks of Biology: ");
		sub5 = sc.nextDouble();
		
		
		Result obj = new Result();
		
		obj.setName(name);
		obj.setUserId(userId);
		obj.setPassword(password);
		
		System.out.println("Name: "+obj.getName());
		System.out.println("User ID: "+obj.getUserId());
		System.out.println("Password: "+obj.getPassword());
		double percentage = obj.totalPercentage(sub1,sub2,sub3,sub4,sub5);
		
		System.out.println("Total Percentage:- ");
		System.out.println(Math.round(percentage * 100.0)/100.0 + " %");
		
		}
}
