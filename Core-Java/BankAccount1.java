import javax.swing.*;

abstract class BankAccount1 {
    double balance;
    abstract void withdraw (double amount );

    void deposit(double amount){
        balance +=amount;
        System.out.println("Deposits"+amount);
    }
}
class SavingsAccount extends BankAccount1{
    @Override
    void withdraw(double amount) {
        if (balance>= amount){
            balance -=amount;
            System.out.println("Withdrawn:"+ amount);
        } else {
            System.out.println("Insufficient balance ");
        }

    }

    public static void main(String[] args) {
        SavingsAccount ank= new SavingsAccount();
                ank.deposit(7777);
                 ank.withdraw(4343);
    }}