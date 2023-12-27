//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part5;

public class Biggestpetshop {
    public static void main(String args[]){
        Pet lucy = new Pet("Lucy", "golden retriever");
        Person leo = new Person("Leo", lucy);

        System.out.println(leo);

    }

    static class Person {

        private String name;
        private Pet pet;
    
        public Person(String name, Pet pet) {
            this.name = name;
            this.pet = pet;
        }
    
        public Person(String name) {
            this(name, new Pet("Toothless", "dragon"));
        }
    
        public Person() {
            this("Lilo", new Pet("Stitch", "blue alien"));
        }
    
        @Override
        public String toString() {
            return this.name + ", has a friend called " + this.pet.getName() + " (" + this.pet.getBreed() + ")";
        }
    
    }

    static class Pet {

        private String name;
        private String breed;
    
        public Pet(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }
    
        public String getName() {
            return name;
        }
    
        public String getBreed() {
            return breed;
        }
    
    }
}