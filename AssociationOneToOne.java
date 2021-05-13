public class AssociationOneToOne {

	public static void main(String[] args) {

		Account a1 = new Account();
		a1.setAccountNumber(1001);
		a1.setAccountHolderName("Mr. Abc");
		a1.setBalance(500);

		//System.out.println(a1);
		System.out.println(a1.show());

		Customer c1 = new Customer();
		c1.setCustomerName("Mr. Abc");
		c1.setPhoneNumber("0198231232");
		c1.setAccount(a1);

		System.out.println(c1.show());
	}
}

// Customer Has A/An Account

class Account {
	private int accountNumber;
	private String accountHolderName;
	private double balance;

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	} 

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public String show() {
		return "accountNumber: " + accountNumber 
		+ " accountHolderName: " + accountHolderName 
		+ " balance: " balance;
	}
}

class Customer {

	private String customerName;
	private String phoneNumber;
	private Account acc;

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setAccount(Account acc) {
		this.acc = acc;
	}

	public Account getAccount() {
		return acc;
	}

	public String show() {
		return "customerName: " + customerName + " phoneNumber: " + phoneNumber + " acc: " + acc.show();
	}
}