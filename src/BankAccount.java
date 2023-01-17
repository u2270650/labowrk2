public class BankAccount {
    // constructor to initialise zero balance
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double initialbalance) {
        balance = initialbalance;
    }

    // deposit balance in the account
    public void Deposit(double amount) {
        balance = balance + amount;
    }

    // withdraw method from the account
    public void Withdraw(double amount) {
        balance = balance - amount;
    }

    public double GetBalance() {
        return balance;
    }

    // transfer amount from one account to another
    public  void transfer(BankAccount other, double amount) {
        Withdraw(amount);
        other.Deposit(amount);
    }
}