package zad1;

public class Account {

	double balance;
	static double interestRate;

	public static void setInterestRate(double interestRate)
	{
		Account.interestRate = interestRate;
	}

	public void transfer(Account account, double money)
	{
		if (this.balance <= money)
		{
			account.balance += this.balance;
			this.balance = 0;
		} else
		{
			this.balance -= money;
			account.balance += money;
		}

	}
	
	
	public void addInterest(){
		balance += (interestRate/100)*balance;
		
	}
	
	public void deposit(double money){
		if(money >= 0)
			balance += money;
		else 
			balance = 0;
		
	}
	public void withdraw(double money){	
		if(money > 0){
			if(balance < money)
				balance = 0;
			else
				balance -= money;
		}
	
	}

}
