package atm_machine;

public class Main {
    public static void main(String[] args) {
        BankAccount ac = new BankAccount(1000.0);
        ATM atm = new ATM(ac);
        atm.run();
    }
}
