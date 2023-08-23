package atm_machine;

public class BankAccount {
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public void withdrawal(double val){
        if(val > checkBalance()){
            System.out.println("Insufficient Balance!");
        }
        else{
            balance = balance - val;
            System.out.println("Rs " + val + " has been deducted from your bank account.");
            System.out.println();
        }
    }
    public void deposit(double val){
        balance += val;
        System.out.println("Rs " + val + " has been deposited into your bank account.");
        System.out.println();
    }
    public double checkBalance(){
        return balance;
    }
}
