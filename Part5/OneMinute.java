//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part5;

public class OneMinute {

    public static void main(String args[]){
        Timer timer = new Timer();
        while (true) {
            System.out.println(timer);
            timer.advance();
            try {
            Thread.sleep(10);
            } catch (Exception e) {
            
            }
        }
    }

static class Timer {
    private ClockHand seconds;
    private ClockHand hundredthsOfSeconds;

    public Timer(){
        this.seconds = new ClockHand(60);
        this.hundredthsOfSeconds = new ClockHand(100);
    }

    public String toString() {
        return seconds + ":" + hundredthsOfSeconds;
    }

    public void advance(){
        this.hundredthsOfSeconds.advance();
        if(this.hundredthsOfSeconds.value() == 0){
            seconds.advance();
        }
    }
}

static class ClockHand {

    private int value;
    private int limit;
    
    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }
    
    public void advance() {
        this.value = this.value + 1;
    
        if (this.value >= this.limit) {
            this.value = 0;
        }
    }
    
    public int value() {
        return this.value;
    }
    
    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }
    
        return "" + this.value;
    }
}
}