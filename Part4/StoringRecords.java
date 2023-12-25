//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
//Note: The TXT file "data(1).txt" is used in this file.
package Part4;

import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class StoringRecords {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);
        }
        scan.close();
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String[] parts = scanner.nextLine().split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                persons.add(new Person(name, age));
            }
        } catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
        return persons;
    }

static class Person {

    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return this.name + ", age: " + this.age;
    }
    
}
}