/**
 This program tests the BankAccount class and
 their subclasses.
 */
public class AccountTest
{
    public static void main(String[] args)
    {
        SavingsAccount momsSavings = new SavingsAccount(0.5);

        CheckingAccount harrysChecking = new CheckingAccount(100);

        momsSavings.Deposit(10000);

        /*
         *  polymorphism observed from BankAccount transfer. where in OTHER is the method
         * */
        momsSavings.transfer(harrysChecking, 2000);
        harrysChecking.withdraw(1500);
        harrysChecking.withdraw(80);

        /*
        *  polymorphism observed from BankAccount transfer. where in OTHER is the method
        * */
        momsSavings.transfer(harrysChecking, 1000);
        harrysChecking.withdraw(400);

        // simulate end of month
        momsSavings.addInterest();
        harrysChecking.deductFees();

        System.out.println("Mom's savings balance = $"
                + momsSavings.GetBalance());

        System.out.println("Harry's checking balance = $"
                + harrysChecking.GetBalance());
    }
}