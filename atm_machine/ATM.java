package atm_machine;

import java.util.Scanner;

public class ATM {
    BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void display(){
        System.out.println("Welcome!");
        System.out.println("ATM Menu:");
        System.out.println("Press '1' for withdrawal.");
        System.out.println("Press '2' for depositing.");
        System.out.println("Press '3' to check balance.");
        System.out.println("Press '4' to quit.");
    }
    public void run(){
        display();
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmt = sc.nextInt();
                    account.withdrawal(withdrawalAmt);
                }
                case 2 -> {
                    System.out.print("Enter deposit amount: ");
                    double depositAmt = sc.nextInt();
                    account.deposit(depositAmt);
                }
                case 3 -> {
                    double balance = account.checkBalance();
                    System.out.println("Balance: " + balance);
                    System.out.println();
                }
                case 4 -> System.out.println("Thank You.");
                default -> System.out.println("Invalid choice.");
            }
        }while(ch != 4);
    }
}
