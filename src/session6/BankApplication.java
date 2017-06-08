package session6;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating 3 objects in BankAtm class

		BankAtm application1 = new BankAtm(1, "SBI", "Delhi", 30000);

		BankAtm application2 = new BankAtm(2, "ICICI", "Chennai", 9000);

		BankAtm application3 = new BankAtm(3, "HDFC", "Bihar", 20000);

		System.out.println("Balance before withdrawal for id " + application1.atmId + " is " + application1.balance);
		// prints Balance before withdrawal for id 1 is 30000.0

		application1.withdraw(20000);// calling withdraw method for object 1

		application1.withdraw(10000);// calling withdraw method for object 1

		System.out.println("Balance after withdrawal for id " + application1.atmId + " is " + application1.balance);
		// prints Balance after withdrawal for id 1 is 0.0

		application1.deposit(10000);// calling deposit method for object 1

		System.out.println("Balance after deposit for id " + application1.atmId + " is " + application1.balance);
		// prints Balance after deposit for id 1 is 10000.0

		System.out.println("Balance before withdrawal for id " + application2.atmId + " is " + application2.balance);
		// prints Balance before withdrawal for id 2 is 9000.0

		application2.withdraw(20000);
		// prints session6.BankATMException: Withdrawal is not allowed

		System.out.println("Balance after withdrawal for id " + application2.atmId + " is " + application2.balance);
		// prints Balance after withdrawal for id 2 is 9000.0

		application2.deposit(10000);// calling deposit method for object 2

		System.out.println("Balance after deposit for id " + application2.atmId + " is " + application2.balance);
		// prints Balance after deposit for id 2 is 19000.0

		System.out.println("Balance before withdrawal for id " + application3.atmId + " is " + application3.balance);
		// prints Balance before withdrawal for id 3 is 20000.0

		application3.withdraw(20000);// calling withdraw method for object 3

		application3.withdraw(10000);
		// prints session6.BankATMException: Withdrawal is not allowed

		System.out.println("Balance after withdrawal for id " + application3.atmId + " is " + application3.balance);
		// prints Balance after withdrawal for id 3 is 0.0

		application3.deposit(10000);// calling deposit method for object 3

		System.out.println("Balance after deposit for id " + application3.atmId + " is " + application3.balance);
		// prints Balance after deposit for id 3 is 10000.0

	}

}
