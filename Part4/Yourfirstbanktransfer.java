//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part4;

public class Yourfirstbanktransfer {
    public static void main(String args []){
        Account matthewsAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0.00);
        matthewsAccount.withdrawal(100.00);
        myAccount.deposit(100.00);
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
    
static class Account {
    private double balance;
    private String owner;
    
    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }
    
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }
    
    public void withdrawal(double amount) {
        this.balance = this.balance - amount;
    }
    
    public double saldo() {
        return this.balance;
    }
    
    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }
}
}