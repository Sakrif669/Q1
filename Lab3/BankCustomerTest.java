public class BankCustomerTest
{
    public static void main(String[] args)
    {
        BankCustomer customer =
            new BankCustomer("Taras Buria", "Castledermot, Kildare");
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount saver3 = new SavingsAccount(1500.00);
        SavingsAccount saver4 = new SavingsAccount(500.00);

        System.out.println("add account 1: "
                + customer.addAccount(saver1));

        System.out.println("add account 2: "
                + customer.addAccount(saver2));

        System.out.println("add account 3: "
                + customer.addAccount(saver3));

        System.out.println("add account 4: "
                + customer.addAccount(saver4));

        System.out.println("add null account: "
                + customer.addAccount(null));

        System.out.printf("total balance: €%.2f%n",
                customer.balance());

        System.out.println();
        customer.summary();
    }
}