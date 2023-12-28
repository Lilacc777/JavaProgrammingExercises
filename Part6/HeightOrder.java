//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part6;

import java.util.Objects;
import java.util.ArrayList;

public class HeightOrder {
    public static void main(String args[]){
        Room room = new Room();
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));
        
        while (!room.isEmpty()) {
            System.out.println(room.take());
        }  
    }

static class Room {
    private ArrayList<Person> persons;

    public Room(){
        this.persons = new ArrayList<>();
    }

    public void add(Person person){
        this.persons.add(person);
    }

    public boolean isEmpty(){
        if(this.persons.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }

    public Person shortest(){
        if(this.persons.isEmpty()){
            return null;
        }
        Person shortestPerson = persons.get(0);
        for(Person person : persons){
            if(person.getHeight() < shortestPerson.getHeight()){
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }

    public Person take(){
        if(this.persons.isEmpty()){
            return null;
        }
        Person shortest = shortest();
        this.persons.remove(shortest);

        return shortest;
    }
}

static class Person {

    private String name;
    private int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.height + " cm)";
    }

    // Created with the insert code functionality of NetBeans
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.height != other.height) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

}
}