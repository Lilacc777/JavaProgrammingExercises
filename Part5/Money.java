//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part5;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition){
        Money money = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return money;
    }

    public boolean lessThan(Money compared){
       if((this.euros + this.cents) < (compared.euros + compared.cents)){
            return true;
       }
       return false;
    }

    public Money minus(Money decreaser){
        int euros = this.euros - decreaser.euros;
        int cents = this.cents - decreaser.cents;

        if(euros < 0){
            return new Money(0, 0);
        }
        
        if(cents < 0){
            euros -= 1;
            cents += 100;
        }
        return new Money(euros, cents);
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}