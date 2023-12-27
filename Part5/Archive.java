package Part5;

import java.util.Scanner;
import java.util.ArrayList;

public class Archive {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            
        }
        
    }

    static class Item {
        
    }
}