package module3;

public final class CurrentAccount extends Account {
	
	final float minbal = 5000f;
	
	

	public CurrentAccount() {
		super();
		
	}
	public CurrentAccount(long accno, String custname, float balance) {
		super(accno, custname, balance);
		
	}
	@Override
	void deposit(float depamt)
	 {
		 this.balance = this.balance+depamt;
		 System.out.printf("Rs. "+ depamt+" Credited to Current A/C. Current Balance is "+ "%.2f",this.balance);
		 System.out.println();
		 
	 }
	 @Override
	 void withdraw(float wdamt)
	 {
		 if (wdamt <= this.balance)
		 {
			 this.balance = this.balance-wdamt;
			 System.out.printf("Rs. "+ wdamt +" debited from Current A/C. Current Balance is  "+ "%.2f",this.balance);
			 System.out.println();
		 }
		 else
		 {
		 		 
		 System.out.println("Not enough balance to Withdraw.");
		 }
	 }
	

}

