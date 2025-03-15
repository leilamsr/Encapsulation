public class SavingAccount extends BankAccount{
    private final double interestRate = 0.03;

    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        double profit = balance * interestRate;
        deposit(profit);
        System.out.println("مبلغ " + profit + " مقدار سود شما است!");
    }
}
