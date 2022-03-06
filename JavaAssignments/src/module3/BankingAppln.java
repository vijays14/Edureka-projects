package module3;

import java.util.Scanner;

public class BankingAppln {

	public static void main(String[] args) {
		Account acc = null;

		Account acc1 = null;
		
		SBAccount SB = new SBAccount();
		CurrentAccount CA = new CurrentAccount();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Welcome to Mod3 Bank Application!!");
			System.out.println("----------------------------------");
			System.out.println("1.Create Account");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Exit Application");
			System.out.println("------------------------------------");
			System.out.print("Enter an option to proceed :");
			
			int option = sc.nextInt();
			int type;

			switch (option) {
			case 1:
				System.out.println("------------------------------------");
				System.out.println("Select type of Account to Create");

				while(true)
				{
					System.out.println("For Savings Account - Enter 1");
					System.out.println("For Current Account - Enter 2");

					System.out.print("Enter an option to proceed :");
					
					type = sc.nextInt();
					sc.nextLine();


					if (acc == null && type ==1)
					{

						System.out.print("Enter Savings Account number: ");
						long accno = sc.nextLong();
						sc.nextLine();
						System.out.print("Enter Name of the Account holder:  ");
						String custname = sc.nextLine();
						
						System.out.println("Enter initial amount to Deposit : ");
						
						System.out.printf("Note:Minimum balance for Savings account is Rs."+ "%.2f", SB.minbalance);
						System.out.println();
						float balance = sc.nextFloat();
						acc = new SBAccount(accno,custname,balance);
						System.out.println("------------------------------------");
						
						System.out.println("Savings Account  '"  +acc.accno + " ' Created Successfully for " + acc.custname + ".");

						

					} else if (acc1 == null && type ==2) 
					{
						System.out.print("Enter Current Account number: ");
						long accno = sc.nextLong();
						sc.nextLine();
						System.out.print("Enter Name of the Account holder:  ");
						String custName = sc.nextLine();
						System.out.print("Enter initial amount to Deposit: ");
						float amount = sc.nextFloat();
						System.out.printf("Note:Minimum balance for Current Account is Rs."+ "%.2f",CA.minbal);
						System.out.println();
						

						System.out.println("------------------------------------");
						System.out.println("Current Account " + accno + " Created Successfully for " + custName + ".");

						acc1 = new CurrentAccount(accno,custName,amount);
					}

					else
					{
						System.out.println("Account Already Created.");
					}

					break;
				}
				break;
			case 2:
				System.out.println("---------------------------------------");
				System.out.print("Enter Account number to Deposit amount : ");

				long accno = sc.nextLong();
				sc.nextLine();
				if (acc != null && accno == acc.accno) {
					System.out.print("Enter amount to Deposit : ");
					float amount = sc.nextFloat();
					System.out.printf("Note:Minimum balance for Savings account is Rs. "+ "%.2f", SB.minbalance);
					System.out.println();
					
					acc.deposit(amount);
				} else if (acc1 != null && accno == acc1.accno)
				{
					System.out.print("Enter amount to Deposit : ");
					float amount = sc.nextFloat();
					System.out.printf("Note:Minimum balance for Current Account is Rs."+"%.2f", CA.minbal);
					System.out.println();
					
					acc1.deposit(amount);

				}else {
					System.out.println("Please Create an Account.");
				}
				break;
			case 3:
				System.out.println("---------------------------------------");
				System.out.print("Enter Account number to Withdraw : ");
				 accno = sc.nextLong();
				sc.nextLine();
				if (acc != null && accno == acc.accno) {
					System.out.print("Enter amount to withdraw from SB Account : ");
					float amount = sc.nextFloat();
					System.out.printf("Note:Minimum balance for Savings account is Rs. "+"%.2f", SB.minbalance);
					System.out.println();
					
					acc.withdraw(amount);
				} else if (acc1 != null && accno == acc1.accno)
				{
					System.out.print("Enter amount to withdraw from Current AC : ");
					float amount = sc.nextFloat();
					System.out.printf("Note:Minimum balance for Current Account is Rs. "+"%.2f", CA.minbal);
					System.out.println();
					
					
					acc1.withdraw(amount);
				}
				else
					System.out.println("Please Create an Account.");

				break;
			case 4:
				System.out.print("*** Exiting Application ***");
				System.exit(0);

				break;
			default:
				System.out.println("Invalid option entered.... Try again with a valid option.");

				break;

			}// switch
			System.out.println("------------------------------------");

		} // while

	}// main

}
