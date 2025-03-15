public class TransactionAccount extends BankAccount{
    private final double overDraftLimit = 500;

    public TransactionAccount (String accountNumber, String accountHolderName, double initialBalance) {
        super( accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("برای این حساب هیچ سودی وجود ندارد!");
    }

    @Override
    public void withdraw (double amount) {
        if (amount < 0) {
            System.out.println("مبلغ وارد شده نامعتبر می باشد!");
            return;
        }
        else if (amount < balance + overDraftLimit) {
            balance -= amount;
            System.out.println("مبلغ " + amount + " با موفقیت برداشته شد!");
        }
        else {
            System.out.println("موحودی کافی نیست!");
        }
    }
}

