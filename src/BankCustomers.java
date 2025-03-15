import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList = new ArrayList<>();

    public BankCustomers() {
        this.accountsList = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accountsList.add(account);
        System.out.println("حساب شما با شماره " + account.getAccountNumber() + " با موفقیت ثبت شد!");
    }

    public void showAllBalances(){
        for (BankAccount account : accountsList) {
            System.out.println("نام حساب شما : " + account.getAccountHolderName());
            System.out.println("شماره حساب شما : " + account.getAccountNumber());
            System.out.println("موجودی حساب شما : " + account.getBalance());
        }
    }

    public BankAccount findAccount(String accountNumber) {
        if (accountsList.isEmpty()) {
            System.out.println("اکانت مورد نظر شما یافت نشد.");
            return null;
        }
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("نام حساب شما : " + account.getAccountHolderName());
                System.out.println("شماره حساب شما : " + account.getAccountNumber());
                System.out.println("موجودی حساب شما : " + account.getBalance());
                return account;
            }
        }
        return null;
    }
}
