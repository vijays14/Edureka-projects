package module3;            

public final class SBAccount extends Account {
	final float minbalance = 2500f;
	float interest_rate = 0.04f;
	
	int noofmonths = 1;
	
	public SBAccount()
	{
		super();
	}
	
	public SBAccount(long accno, String custname, float balance) {
		super(accno, custname, balance);
		
	}


	public SBAccount(long accno, String custname, float balance, float interest_rate) {
		super(accno, custname, balance);
		this.interest_rate = interest_rate;
	}

	float interestcalc(float interest_rate,float balance,int noofmonths)
	{
		float interest = this.interest_rate * this.balance*noofmonths;
		
		System.out.println("Interest for the Savings account for the past "+noofmonths+" month(s) Rs. "+interest);
		
		return interest;
	}

	
@Override
	void deposit(float depamt)
	 {
	 	
		 this.balance = this.balance+depamt + interestcalc(interest_rate,this.balance,noofmonths);
		 
		 System.out.printf("Rs. "+ depamt+" Credited to Savings A/C. Current Balance is "+ "%.2f",this.balance);
		 System.out.println();
		 
	 }
	 @Override
	 void withdraw(float wdamt)
	 {
		 if (wdamt <= this.balance)
		 {
			 
			this.balance = this.balance-wdamt;
			 System.out.printf("Rs. "+ "%.2f",wdamt +" debited from Savings A/C. Current Balance is  "+ "%.2f",this.balance);
			 System.out.println();
			 if (this.balance < minbalance)
			 {
				 System.out.printf("Saving Account balance amount Rs. " +"%.2f", this.balance + " is less than the Minimum Account Balance Rs." +"%.2f", minbalance);
				 System.out.println();
			 }
		 }
		 else
		 {
		 		 
		 System.out.println("Not enough balance to Withdraw");
		 }
	 }


	
}

