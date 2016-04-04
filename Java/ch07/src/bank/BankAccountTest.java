package bank;

class BankAccount{
	int balance;
	void deposit(int amount){
		balance += amount;
	}
	void withdraw(int amount){
		if(balance>0)
			balance -= amount;
		else
			System.out.println("error");
	}
	int getBalance(){
		return balance;
	}
	void addInterest(){
		balance *= 1.075;
	}
}

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		account.balance = 100;
		account.withdraw(60);
		System.out.println(account.getBalance());
		
		account.addInterest();
		System.out.println(account.balance);
		
		System.out.println("2 + 3 = " + 2 + 3);
		
		
	}

}
