//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part5;

public class Healthstation {
    
    static class HealthStation{
        private int weighings;

        public HealthStation(){
            this.weighings = 0;
        }

        public int weigh(Person person){
            this.weighings++;
            return person.getWeight();
        }

        public void feed(Person person){
            person.setWeight(person.getWeight() + 1);
        }

        public int weighings(){
            return this.weighings;
        }
    }

    static class Person {

        private String name;
        private int age;
        private int height;
        private int weight;
    
        public Person(String name, int age, int height, int weight) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }
    
        public void printPerson() {
            System.out.println("My name is " + this.name + " and I am " + this.age + " years old");
        }
    
        public void growOlder() {
            this.age++;
        }
    
        public boolean isOfLegalAge() {
            if (this.age > 17) {
                return true;
            }
    
            return false;
        }
    
        public void setHeight(int height) {
            this.height = height;
        }
    
        public int getHeight() {
            return this.height;
        }
    
        public int getWeight() {
            return this.weight;
        }
    
        public void setWeight(int weight) {
            this.weight = weight;
        }
    
        public double bmi() {
            double heightInMeters = this.height / 100.0;
    
            return this.weight / (heightInMeters * heightInMeters);
        }
    
        public String getName() {
            return this.name;
        }
    
        @Override
        public String toString() {
            return "My name is " + this.name + " and I am " + this.age + " years old. My BMI is " + this.bmi();
        }
    }
}