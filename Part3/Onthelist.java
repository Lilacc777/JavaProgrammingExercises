package Part3;

import java.util.Scanner;
import java.util.ArrayList;

public class Onthelist {
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            } else {
                names.add(name);
            }
        }
        System.out.print("Search for? ");
        String search = scanner.nextLine();
        boolean found = names.contains(search);
        if(found){
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
        scanner.close();
    }
}