public class MainBank {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Mohamed Isa", "saving", 20709773L, 4137450004189994L, 300.0);
        BankAccount acc2 = new BankAccount("Mohamed Isa", 20709773L);
        System.out.println(acc2.AccountID);
    }
}