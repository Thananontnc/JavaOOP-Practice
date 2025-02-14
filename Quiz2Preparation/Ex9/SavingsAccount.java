package Ex9;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    public double getInerestRate() {
        return this.interestRate;
    }

    @Override
    public void deposit(double amount) {
        double interest = (amount * interestRate) / 100;
        super.deposit(amount + interest); // Deposit amount + interest
    }

}
