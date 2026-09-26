import java.util.List;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }
 public void deposit(double amount) {
     if (amount > 0) balance += amount;
 }
   public void withdraw( double amount ){
        if (amount<= balance) balance -=amount;
    }
// This is code of Encapsulation with Validation

public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.deposit(8999);
    account.withdraw(3444);
    System.out.println("Balance:"+account.getBalance());
}}