
public class Account {
	private long accNo;
	private String name, email;
	private float amount;
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
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
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}

}

class TestAccount {
	public static void main(String[] args) {
		Account a = new Account();
		a.setAccNo(317831);
		System.out.println(a.getAccNo());
		a.setName("Sayan");
		System.out.println(a.getName());
		a.setEmail("sayanrick100@gmail.com");
		System.out.println(a.getEmail());
		a.setAmount(200000);
		System.out.println(a.getAmount());
	}
}
