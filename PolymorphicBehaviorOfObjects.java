// In a bank, a customer can open either savings account or fixed account

public class PolymorphicBehaviorOfObjects {
	public static void main(String[] args) {
		/* Before polymorphic behavior of objects
		SavingsAccount sa1 = new SavingsAccount(1, "Mr. Abc", 500, 9.5);
		//FixedAccount fa1 = null;
		Customer c1 = new Customer("Mr. Abc", "0172623812", sa1, null);

		System.out.println(sa1.show());
		System.out.println(c1.show());*/

		Account acc1 = new SavingsAccount(2, "Mr. Def", 5000, 10.5);
		Customer c2 = new Customer("Mr. Def", "0172623812", acc1);

		System.out.println(acc1.show());
		System.out.println(c2.show());

		Account acc2 = new FixedAccount(3, "Mr. Ghi", 15000, 2);
		Customer c3 = new Customer("Mr. Ghi", "0172623812", acc2);

		System.out.println(acc2.show());
		System.out.println(c3.show());

	}
}

class Customer {

	private String customerName;
	private String phoneNumber;
	/*private SavingsAccount sa;
	private FixedAccount fa;*/
	private Account acc;

	public Customer() {

	}

	/*public Customer(String customerName, String phoneNumber, SavingsAccount sa, FixedAccount fa) {
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.sa = sa;
		this.fa = fa;
	}*/

	public Customer(String customerName, String phoneNumber, Account acc) {
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.acc = acc;
	}

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

	/*public void setSavingsAccount(SavingsAccount sa) {
		this.sa = sa;
	}

	public SavingsAccount getSavingsAccount() {
		return sa;
	}

	public void setFixedAccount(FixedAccount fa) {
		this.fa = fa;
	}

	public FixedAccount getFixedAccount() {
		return fa;
	}*/

	public void setAccount(Account acc) {
		this.acc = acc;
	}

	public Account getAccount() {
		return acc;
	}

	public String show() {
		/*return "customerName: " + customerName + " phoneNumber: " + phoneNumber + " savingsAccount: " + sa.show() + " fixedAccount: " + fa.show();*/
		/*if(sa != null) {
			return "customerName: " + customerName + " phoneNumber: " + phoneNumber + " savingsAccount: " + sa.show();
		}
		else if(fa != null) {
			return "customerName: " + customerName + " phoneNumber: " + phoneNumber + " fixedAccount: " + fa.show();
		}
		else {
			return "customerName: " + customerName + " phoneNumber: " + phoneNumber;
		}*/

		return "customerName: " + customerName + " phoneNumber: " + phoneNumber + " acc: " + acc.show();
	}
}

class Account {
	private int accountNumber;
	private String accountHolderName;
	private double balance;

	public Account() {

	}

	public Account(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

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

class SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount() {

	}

	public SavingsAccount(double interestRate) {
		this.interestRate = interestRate;
	}

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
		super(accountNumber, accountHolderName, balance);
		this.interestRate = interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public String show() {
		return super.show() + " interestRate: " + interestRate;
	}
}

class FixedAccount extends Account {
	private int tenureYear;

	public FixedAccount() {

	}

	public FixedAccount(int tenureYear) {
		this.tenureYear = tenureYear;
	}

	public FixedAccount(int accountNumber, String accountHolderName, double balance, int tenureYear) {
		super(accountNumber, accountHolderName, balance);
		this.tenureYear = tenureYear;
	}

	public void setTenureYear(int tenureYear) {
		this.tenureYear = tenureYear;
	}

	public int getTenureYear() {
		return tenureYear;
	}

	public String show() {
		return super.show() + " tenureYear: " + tenureYear;
	}
}