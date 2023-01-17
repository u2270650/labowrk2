/*
* An account that earns interest at a fixed rate*/
public class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(double rate) {
        interestRate = rate;
    }

    public  void addInterest() {
        double interest = GetBalance() * interestRate / 100;
        Deposit(interest);
    }
}