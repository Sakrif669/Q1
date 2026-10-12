public class SavingsAccount
{
    private static double annualInterestRate;
    private static int nextAccountNumber = 1;
    private int accountNumber;
    private double savingsBalance;

    public SavingsAccount(double balance)
    {
        accountNumber = nextAccountNumber++;
        savingsBalance = balance;
    }
    public void calculateMonthlyInterest()
    {
        double monthlyInterest = savingsBalance * annualInterestRate / 12;
        savingsBalance += monthlyInterest;
    }
    public static void modifyInterestRate(double newRate)
    {
        annualInterestRate = newRate;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public double getSavingsBalance()
    {
        return savingsBalance;
    }
}