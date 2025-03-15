public class Main {
    public static void main(String[] args) {
        BankCustomers bank = new BankCustomers();

        BankAccount BAS1 = new SavingAccount("01", "Leila", 1000);
        BankAccount BAS2 = new SavingAccount("02", "Faegheh", 1000);
        BankAccount BAS3 = new SavingAccount("03", "Nastaran", 1000);

        BankAccount BAT1 = new TransactionAccount("04", "Narges", 2000);
        BankAccount BAT2 = new TransactionAccount("05", "Goli", 2000);
        BankAccount BAT3 = new TransactionAccount("06", "Faezeh", 2000);

        bank.addAccount(BAS1);
        bank.addAccount(BAS2);
        bank.addAccount(BAS3);
        bank.addAccount(BAT1);
        bank.addAccount(BAT2);
        bank.addAccount(BAT3);

        bank.findAccount("01");
        bank.findAccount("00");

        System.out.println(BAS2.getBalance());

        BAS2.deposit(200);
        System.out.println(BAT2.getBalance());

        BAS3.deposit(-200);
        System.out.println(BAT3.getBalance());

        BAS1.calculateInterest();
        BAT1.calculateInterest();

        BAS1.withdraw(500);
        BAS2.withdraw(-500);
        BAS3.withdraw(5000);

        BAT1.withdraw(500);
        BAT2.withdraw(-500);
        BAT3.withdraw(5000);

        bank.showAllBalances();
    }
}