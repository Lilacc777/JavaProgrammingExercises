//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part5;

public class Cardpayments {
    
    static class PaymentTerminal {
        private double money;
        private int affordableMeals;
        private int heartyMeals;
    
        public PaymentTerminal() {
            this.money = 1000;
        }
    
        public double eatAffordably(double payment) {
            if(payment >= 2.50){
                this.money += 2.50;
                this.affordableMeals++;
                return payment - 2.50;
            } else {
                return payment;
            }
        }
    
        public double eatHeartily(double payment) {
            if(payment >= 4.30){
                this.money += 4.30;
                this.heartyMeals++;
                return payment - 4.30;
            } else {
                return payment;
            }
        }

        public boolean eatAffordably(PaymentCard card) {
            if(card.takeMoney(2.50)){
                this.affordableMeals++;
                return true;
            } else {
                return false;
            }
        }
    
        public boolean eatHeartily(PaymentCard card) {
            if(card.takeMoney(4.30)){
                this.heartyMeals++;
                return true;
            } else {
                return false;
            }
        }

        public void addMoneyToCard(PaymentCard card, double sum){
            if(sum >= 0){
                card.addMoney(sum);
                this.money += sum;
            } else {
                return;
            }
        }
    
        public String toString() {
            return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
        }
    }    

    static class PaymentCard {
        private double balance;
    
        public PaymentCard(double balance) {
            this.balance = balance;
        }
    
        public double balance() {
            return this.balance;
        }
    
        public void addMoney(double increase) {
            this.balance = this.balance + increase;
        }
    
        public boolean takeMoney(double amount) {
            if(this.balance() >= amount){
                this.balance = this.balance() - amount;
                return true;
            } else {
                return false;
            }
        }
    }
}