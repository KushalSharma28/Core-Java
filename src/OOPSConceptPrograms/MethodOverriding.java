package OOPSConceptPrograms;

class BankAccount 
{
    protected double balance;

    public BankAccount(double initialBalance) 
    {
        balance = initialBalance;
    }

    // Method to calculate interest; to be overridden by subclasses
    public double calculateInterest() 
    {
        return balance * 0.03;  // 3% interest for a general account
    }

    public void displayInterest() 
    {
        System.out.println("Interest: " + calculateInterest());
    }
}

class SavingsAccount extends BankAccount 
{

    public SavingsAccount(double initialBalance) 
    {
        super(initialBalance);
    }

    @Override
    public double calculateInterest() 
    {
        // Savings account gets 5% interest
        return balance * 0.05;
    }
}

class FixedDepositAccount extends BankAccount 
{

    public FixedDepositAccount(double initialBalance) 
    {
        super(initialBalance);
    }

    @Override
    public double calculateInterest() 
    {
        // Fixed deposit gets 7% interest
        return balance * 0.07;
    }
}

public class MethodOverriding 
{
	public static void main(String[] args) 
	{
		BankAccount regularAccount = new BankAccount(1000);
        BankAccount savingsAccount = new SavingsAccount(1000);
        BankAccount fixedDepositAccount = new FixedDepositAccount(1000);

        regularAccount.displayInterest();       // Interest: 30.0
        savingsAccount.displayInterest();       // Interest: 50.0
        fixedDepositAccount.displayInterest();  // Interest: 70.0
	}

}
