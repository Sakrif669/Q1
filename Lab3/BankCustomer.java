public class BankCustomer
{
    private String name;
    private String address;
    private SavingsAccount[] accounts;
    private int numberOfAccounts;
	
    public BankCustomer(String name, String address)
    {
        this.name = name;
        this.address = address;
        accounts = new SavingsAccount[3];
        numberOfAccounts = 0;
    }
    public boolean addAccount(SavingsAccount account)
    {
        if (account == null || numberOfAccounts >= 3)
        {
            return false;
        }
        accounts[numberOfAccounts] = account;
        numberOfAccounts++;
        return true;
    }
    public double balance()
    {
        double total = 0.0;
        for (int i = 0; i < numberOfAccounts; i++)
        {
            total += accounts[i].getSavingsBalance();
        }
        return total;
    }
    public void summary()
    {
        System.out.println("customer: " + name);
        System.out.println("address: " + address);
        System.out.println("accounts:");
        for (int i = 0; i < numberOfAccounts; i++)
        {
            System.out.printf(
                "account %d: €%.2f%n",
                accounts[i].getAccountNumber(),
                accounts[i].getSavingsBalance()
            );
        }
        System.out.printf("Total balance: €%.2f%n", balance());
    }
}