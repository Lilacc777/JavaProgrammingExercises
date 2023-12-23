package Part4;

public class PaymentCard {
    public static void main(String args[]){
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
    
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card as a balance of " + balance + " euros";
    }

    public void eatAffordably() {
        if(this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if(this.balance >= 4.60){
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount){
        if(amount < 0){
            return;
        }
        if(150 > this.balance + amount){
            this.balance += amount;
        } else {
            this.balance = 150;
        }
    }
}