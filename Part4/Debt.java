package Part4;

public class Debt {
    public static void main(String[] args) {
        //Note: I tried the example after the original directions for the 1900s recession interest rates.
        Debt mortgage = new Debt(120000.0, 1.20);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
    }
    
    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance(){
        System.out.println(this.balance);
    }

    public void waitOneYear(){
        this.balance = this.balance * this.interestRate;
    }
}