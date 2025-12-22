	package oops_tasks;
	class BankAccount {
		    String accountNumber;
		    String accountHolder;
		    double balance;

		    void deposit(double amount) {
		        balance += amount;
		        System.out.println(amount + " deposited.");
		    }

		    void withdraw(double amount) {
		        if(amount <= balance) {
		            balance -= amount;
		            System.out.println(amount + " withdrawn.");
		        } else {
		            System.out.println("Not enough balance.");
		        }
		    }

		    void displayBalance() {
		        System.out.println("Account Number: " + accountNumber);
		        System.out.println("Account Holder: " + accountHolder);
		        System.out.println("Balance: " + balance);
		        System.out.println();
		    }
		}

		public class bank_account {
		    public static void main(String[] args) {

		        BankAccount a1 = new BankAccount();
		        BankAccount a2 = new BankAccount();
		        
		        a1.accountNumber = "A123";
		        a1.accountHolder = "Barath";
		        a1.balance = 1000;

		        
		        a2.accountNumber = "A124";
		        a2.accountHolder = "Sanjay";
		        a2.balance = 2000;

		        a1.deposit(500);
		        a1.withdraw(200);
		        a1.displayBalance();

		        a2.deposit(1000);
		        a2.withdraw(1500);
		        a2.displayBalance();
		    }
		}