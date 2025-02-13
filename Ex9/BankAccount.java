package Ex9;

public class BankAccount {
    private int accountNo;
    private double balance;

    public BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int getAccountNo() {
        return this.accountNo;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0 ) {
            balance += amount;
            System.out.println("Deposit " + amount + " -> New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Withdraw " + amount + " -> New Balance: " + balance);
        } else{
            System.out.println("Insufficient balance!");
        }

    }
    
    public void displayAccount() {
        System.out.println("Account No: " + accountNo + ", Balance: " + balance);
    }

}


class Main {
    public static void main(String[] args) {
        // Creating Savings Account
        SavingsAccount savings = new SavingsAccount(1001, 5000.0, 5.0);
        savings.displayAccount();
        savings.deposit(1000.0);
        savings.withdraw(2000.0);

        System.out.println();

        // Creating Checking Account
        CheckingAccount checking = new CheckingAccount(2001, 3000.0, 1000.0);
        checking.displayAccount();
        checking.deposit(500.0);
        checking.withdraw(4000.0); // Overdraft scenario
    }
    
}