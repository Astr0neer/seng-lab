package lab5;



public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Alice", 500.0);
        System.out.println(bankAccount.toString());
        bankAccount.deposit(250.0);
        bankAccount.withdraw(100.0);
        System.out.println(bankAccount);

        BankAccount bankAccount1 = new BankAccount("Bob", 1000.0);
        System.out.println(bankAccount1.toString());
        bankAccount1.deposit(500.0);
        bankAccount1.withdraw(200.0);
        System.out.println(bankAccount1);

        
        
    }

}
