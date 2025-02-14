package BankAccount;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void showDetails(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    protected double calculateInterest(){
        return 0;
    }

    public double getBalance(){
        return balance;
    }
}
