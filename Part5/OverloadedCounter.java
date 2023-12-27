package Part5;

public class OverloadedCounter {
    
public class Counter{
    private int startValue;

    public Counter(int startValue){
        this.startValue = startValue;
    }

    public Counter(){
        this(0);
    }

    public int value(){
        return this.startValue;
    }
    
    public void increase(){
        increase(1);
    }

    public void decrease(){
        decrease(1);
    }

    public void increase(int increaseBy){
        if(increaseBy >= 0){
            this.startValue += increaseBy;
        } else {
            return;
        }
    }

    public void decrease(int decreaseBy){
        if(decreaseBy >= 0){
            this.startValue -= decreaseBy;
        } else {
            return;
        }
    }
}
}