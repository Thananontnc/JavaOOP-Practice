package Ex9;

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    // Constructor
    public CheckingAccount(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance); // Call parent constructor
        this.overdraftLimit = overdraftLimit;
    }

    // Getter method
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // Override withdraw method (allow overdraft)
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            double newBalance = getBalance() - amount;
            System.out.println("Withdraw " + amount + " -> New Balance: " + newBalance);
        } else {
            System.out.println("Overdraft limit reached!");
        }
    }
}