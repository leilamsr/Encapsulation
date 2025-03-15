public abstract class BankAccount {
    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("مبلغ وارد شده نامعتبر می باشد!");
            return;
        }
        else {
            balance += amount;
            System.out.println("مبلغ " + amount + " به حساب " + accountNumber + " با موفقیت اضافه شد!");
        }

    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("مبلغ وارد شده نامعتبر می باشد!");
            return;
        }
        else {
            balance -= amount;
            System.out.println("مبلغ " + amount + " از حساب " + accountNumber + " با موفقیت برداشته شد!");
        }
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
}
