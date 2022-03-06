package module3;

public abstract class Account {
	 long accno;
	 String custname;
	 float balance;
	 public Account()
	 {
		 
	 }
	public Account(long accno, String custname, float balance) {
		super();
		this.accno = accno;
		this.custname = custname;
		this.balance = balance;
	}

	 abstract void deposit(float depamt);
	 
	 abstract void withdraw(float wdamt);

		 
}
