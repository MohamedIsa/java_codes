public class BankAccount {
    String ownerName, accountName;
    long CPR ,AccountID;
    double balance;
    public BankAccount(String on, String an, long cpr, long ID, double b) {
        ownerName = on;
        accountName = an;
        CPR = cpr;
        AccountID = ID;
        balance = b;
    }
    public BankAccount(String on, Long cpr) {
        ownerName = on;
        accountName = "saving";
        CPR = cpr;
        AccountID = 4137450004189994L;
        balance = 0.0;
    }
    public BankAccount(String on,Long cpr,double b) {
        ownerName = on;
        accountName = "saving";
        CPR = cpr;
        AccountID = 4137450004186543L;
        balance = b;
    }
    double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
        else
            System.out.println("Insufficient balance");

    }
}
