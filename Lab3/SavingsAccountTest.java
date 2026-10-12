public class SavingsAccountTest
{
    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Annual interest rate: 4%");
        System.out.printf("Account %d balance: %.2f%n",
                saver1.getAccountNumber(),
                saver1.getSavingsBalance());
        System.out.printf("Account %d balance: %.2f%n",
                saver2.getAccountNumber(),
                saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\nAnnual interest rate: 5%");
        System.out.printf("Account %d balance: %.2f%n",
                saver1.getAccountNumber(),
                saver1.getSavingsBalance());
        System.out.printf("Account %d balance: %.2f%n",
                saver2.getAccountNumber(),
                saver2.getSavingsBalance());
    }
}