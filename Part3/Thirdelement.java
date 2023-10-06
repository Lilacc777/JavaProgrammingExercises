package Part3;

// I do not have access to the default code in this exercise, so I instead added what I believe is in the code:
import java.util.ArrayList;

public class Thirdelement {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Emma");
        names.add("Alex");
        names.add("Mary");

        System.out.println(names.get(2));
    }
}