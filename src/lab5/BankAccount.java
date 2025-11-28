package lab5;

import java.util.Random;
public class BankAccount {
    Random random = new Random();

    private int accountNumber;
    private String ownerName;
    private double balance;
    private  static int totalAccounts =0;
    private final double MIN_BALANCE = 0.00;
    private final double MAX_WITHDRAW_LIMIT = 2000.00;

    BankAccount(String ownerName, double balance){
        this.ownerName = ownerName;
        
        accountNumber = random.nextInt(100000, 999999);
        totalAccounts++;
        if(balance < MIN_BALANCE){
            balance = MIN_BALANCE;
        }else{
            this.balance = balance;
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }
    public void withdraw(double amount) {
        if(amount > MAX_WITHDRAW_LIMIT) {
            System.out.println("Withdrawal amount exceeds the limit");
        }
        else{
            balance -= amount;
        }
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void getAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: " + balance);
    }

    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", ownerName=" + ownerName + ", balance=" + balance + "]";
    }

}
