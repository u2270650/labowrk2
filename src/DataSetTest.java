/**
 This program tests the DataSet class.
 */
public class DataSetTest
{
    public static void main(String[] args)
    {
        // polymorphism is observed in the Dataset method of adding Balance and coins
        DataSet bankData = new DataSet();

        bankData.add(new BankAccount(0));
        bankData.add(new BankAccount(10000));
        bankData.add(new BankAccount(2000));

        System.out.println("Average balance = "
                + bankData.getAverage()); // polymorphism
        Measurable max = bankData.getMaximum(); //  polymorphism
        System.out.println("Highest balance = "
                + max.getMeasure()); // polymorphism
    }
}