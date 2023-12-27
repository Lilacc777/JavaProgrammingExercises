//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part5;

public class Datingapp {
    static class SimpleDate {
        private int day;
        private int month;
        private int year;
    
        public SimpleDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public void advance(){
            this.day++;
            if(this.day > 30){
                this.month++;
                this.day = 1;
            }
            if(this.month > 12){
                this.year++;
                this.month = 1;
            }
        }

        public void advance(int howManyDays){
            for(int i = 0; i < howManyDays; i++){
                this.advance();
            }
        }

        public SimpleDate afterNumberOfDays(int days){
            SimpleDate newDate = new SimpleDate(day, month, year);
            for(int i = 0; i < days; i++){
                newDate.advance();
            }
            return newDate;
        }

        public String toString() {
            return this.day + "." + this.month + "." + this.year;
        }
    
        public boolean before(SimpleDate compared) {
            // first compare years
            if (this.year < compared.year) {
                return true;
            }
    
            // if the years are the same, compare months
            if (this.year == compared.year && this.month < compared.month) {
                return true;
            }
    
            // the years and the months are the same, compare days
            if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
                return true;
            }
    
            return false;
        }
    }
}