public class Account {
	 private String accName;
	 private String acid;
	 private int balance;

	Account() {}

	Account(String accName, String acid, int balance) {
		this.accName = accName;
		this.acid = acid;
		this.balance = balance;
	}

	public void deposit(int amount)  {
		this.balance = this.balance + amount;
		// this.balance += amount;
	}

	public void withdraw(int amount) {
		this.balance = this.balance - amount;
		// this.balance -= amount;
	}

	public void transfer(int amount, Account receiver) {
		receiver.deposit(amount);
		this.withdraw(amount);
	}

	public static void main(String args[]) {
		Account Leo = new Account("", "420", 100);
		Account King = new Account("venom", "001", 50);

		Leo.deposit(10);
		Leo.withdraw(50);

		King.deposit(30);
		King.withdraw(30);

		Leo.transfer(25,venim);

	}
}
