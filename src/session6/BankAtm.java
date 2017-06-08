package session6;

public class BankAtm extends Bank {

	// initializing Integer atmId variable
	int atmId;

	// initializing String bankName variable
	String bankName;

	// initializing String location variable
	String location;

	// initializing double balance variable
	double balance;

	// declaring parameterized constructor

	BankAtm(int atmId, String bankName, String location, double balance) {

		// assigning values for instance variables

		this.atmId = atmId;

		this.bankName = bankName;

		this.location = location;

		this.balance = balance;

	}

	@Override
	void withdraw(double amt) {

		// checking amount and balance by certain condition

		if (balance < 10000 || amt > balance) {

			// throw Custom Defined Exception

			try {

				throw new BankATMException("Withdrawal is not allowed");

			} catch (BankATMException e) {

				System.out.println(e);
				// prints Withdrawal is not allowed
			}

		} else {

			balance -= amt;
			// withdrawal from balance
		}
	}

	@Override
	void deposit(double amt) {

		balance += amt;// adding amount in balance

	}
}