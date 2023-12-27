//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part5;

public class Identicaltwins {

    static class Person {

        private String name;
        private SimpleDate birthday;
        private int height;
        private int weight;
    
        public Person(String name, SimpleDate birthday, int height, int weight) {
            this.name = name;
            this.birthday = birthday;
            this.height = height;
            this.weight = weight;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Person other = (Person) obj;
            if (birthday == null) {
                if (other.birthday != null)
                    return false;
            } else if (!birthday.equals(other.birthday))
                return false;
            if (height != other.height)
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            if (weight != other.weight)
                return false;
            return true;
        }
    }

    public class SimpleDate {

        private int day;
        private int month;
        private int year;
    
        public SimpleDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    
        public int getDay() {
            return this.day;
        }
    
        public int getMonth() {
            return this.month;
        }
    
        public int getYear() {
            return this.year;
        }
    
        public boolean equals(Object compared) {
            if(this == compared){
                return true;
            }

            if(!(compared instanceof SimpleDate)){
                return false;
            }

            SimpleDate comparedDate = (SimpleDate) compared;

            if(this.day == comparedDate.day && this.month == comparedDate.month && this.year == comparedDate.year){
                return true;
            }

            return false;
        }
    
        @Override
        public String toString() {
            return this.day + "." + this.month + "." + this.year;
        }
    }
}