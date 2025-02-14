package BankAccount;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate){
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest(){
        return getBalance() * (interestRate / 100);
    }
    
}
