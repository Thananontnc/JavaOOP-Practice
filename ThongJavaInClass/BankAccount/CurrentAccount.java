package BankAccount;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountHolder,double balance, double overdraftLimit){
        super(accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double calculateInterest(){
        return 0;
    }
    
}
