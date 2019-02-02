package zad1;

public class BankCustomer {

	Person person;
	private Account account;

	public BankCustomer(Person person)
	{
		this.person = person;
		account = new Account();
		
	}
	
	public Account getAccount(){

		return account;
		
	}

	@Override
	public String toString()
	{
		return "Klient: " + person + " stan konta " + account.balance;
	}
	
	
}
