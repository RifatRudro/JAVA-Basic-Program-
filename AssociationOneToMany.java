public class AssociationOneToMany {

	public static void main(String[] args) {

		Account a1 = new Account();
		a1.setAccountNumber(1001);
		a1.setAccountHolderName("Mr. Abc");
		a1.setBalance(500);

		//System.out.println(a1);
		System.out.println(a1.show());

		Account a2 = new Account();
		a2.setAccountNumber(1002);
		a2.setAccountHolderName("Mr. Abc");
		a2.setBalance(1500);

		System.out.println(a2.show());

		Account a3 = new Account();
		a3.setAccountNumber(1003);
		a3.setAccountHolderName("Mr. Abc");
		a3.setBalance(15000);

		System.out.println(a3.show());

		Customer c1 = new Customer();
		c1.setCustomerName("Mr. Abc");
		c1.setPhoneNumber("0198231232");


  Book listOfBooks[] b= new Book listOfBooks[100];
  b[0]= a1;
  b[1]= a2; 
  
  

		Account[] arr = new Account[3];
		arr[0] = a1;
		arr[1] = a2;
		arr[2] = a3;

		// arr = a1; // It is not possible as arr is an array.

		c1.setAccounts(arr);

		System.out.println(c1.show());
		System.out.println(c1.getAccounts()[0].show());
		System.out.println(c1.getAccounts()[1].show());
		System.out.println(c1.getAccounts()[2].show());
	}
}

// Customer Has Accounts

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
		return "accountNumber: " + accountNumber + " accountHolderName: " + accountHolderName + " balance: " + balance;
	}
}

class Customer {

	private String customerName;
	private String phoneNumber;
	private Account acc[];

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

	public void setAccounts(Account[] acc) {
		this.acc = acc;
	}

	public Account[] getAccounts() {
		return acc;
	}

	public String show() {
		/*return "customerName: " + customerName + " phoneNumber: " + phoneNumber + " acc: " + acc;*/
		/*return "customerName: " + customerName + " phoneNumber: " + phoneNumber + " acc: " + acc.show();*/
		return "customerName: " + customerName + " phoneNumber: " + phoneNumber;
	}
}