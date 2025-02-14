package Ex13 ;

// Parent Class: Loan
class Loan {
    private double amount;
    private double interestRate;

    // Default Constructor
    public Loan() {
        this.amount = 0.0;
        this.interestRate = 0.0;
    }

    // Parameterized Constructor
    public Loan(double amount, double interestRate) {
        this.amount = amount;
        this.interestRate = interestRate;
    }

    // Getter methods
    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    // Method to calculate interest (to be overridden)
    public void calculateInterest() {
        System.out.println("Loan Amount: $" + amount + ", Interest Rate: " + interestRate + "%");
    }


    public static void main(String[] args) {
        // Creating Default Loan Object
        Loan defaultLoan = new Loan();
        defaultLoan.calculateInterest();

        // Creating Personal Loan Object
        PersonalLoan personalLoan = new PersonalLoan(5000.0, 5.0, 3);
        personalLoan.calculateInterest();

        // Creating Home Loan Object
        HomeLoan homeLoan = new HomeLoan(100000.0, 3.5, 10);
        homeLoan.calculateInterest();
    }
}

// Subclass: PersonalLoan
class PersonalLoan extends Loan {
    private int tenure; // in years

    // Parameterized Constructor
    public PersonalLoan(double amount, double interestRate, int tenure) {
        super(amount, interestRate); // Call parent constructor
        this.tenure = tenure;
    }

    // Getter method
    public int getTenure() {
        return tenure;
    }

    // Overriding calculateInterest() method
    @Override
    public void calculateInterest() {
        double interest = getAmount() * (getInterestRate() / 100) * tenure;
        System.out.println("Personal Loan: Amount: $" + getAmount() + ", Interest Rate: " + getInterestRate() + "%, Tenure: " + tenure + " years");
        System.out.println("Total Interest: $" + interest);
        System.out.println();
    }
}

// Subclass: HomeLoan
class HomeLoan extends Loan {
    private int tenure; // in years

    // Parameterized Constructor
    public HomeLoan(double amount, double interestRate, int tenure) {
        super(amount, interestRate); // Call parent constructor
        this.tenure = tenure;
    }

    // Getter method
    public int getTenure() {
        return tenure;
    }

    // Overriding calculateInterest() method
    @Override
    public void calculateInterest() {
        double interest = getAmount() * ((getInterestRate() / 2) / 100) * tenure;
        System.out.println("Home Loan: Amount: $" + getAmount() + ", Interest Rate: " + getInterestRate() + "%, Tenure: " + tenure + " years");
        System.out.println("Total Interest: $" + interest);
        System.out.println(); 
    }
}

// Main Class
public class BankLoanSystem {
}
