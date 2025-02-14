package BankAccount;

public class Main {
    public static void displayAccount(BankAccount obj){
        obj.showDetails();
        System.out.println("interest Earned: $" + obj.calculateInterest());
        System.out.println();
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("John Doe", 5000, 5);
        CurrentAccount current = new CurrentAccount("Jane smith", 3000, 1000);

        displayAccount(savings);
        displayAccount(current);

    }
    
}
