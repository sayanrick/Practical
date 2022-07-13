
public class Bank_Details {
	private String name;
	private String email;
	private int accNum;
	private int amount;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}

class Test_Bank {
	public static void main(String[] args) {
		Bank_Details obj = new Bank_Details();
		obj.setName("Sayan");
		System.out.println(obj.getName());
		
		obj.setEmail("sayanrick100@gmail.com");
		System.out.println(obj.getEmail());
		
		obj.setAccNum(1234311);
		System.out.println(obj.getAccNum());
		
		obj.setAmount(20000);
		System.out.println(obj.getAmount());
		
		// name, userId, password, marks of 5 subject
		
	}
	
}