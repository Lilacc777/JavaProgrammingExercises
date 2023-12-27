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

            Item newItem = new Item(identifier, name);
            if(!items.contains(newItem)){
                items.add(newItem);
            }
        }
        System.out.println("==Items==");
        for(Item Item: items){
            System.out.println(Item.getIdentifier() + ": " + Item.getName());
        }
        scanner.close();
    }

    static class Item {
        private String identifier;
        private String name;

        public Item(String identifier, String name) {
            this.identifier = identifier;
            this.name = name;
        }

        public String getIdentifier() {
            return identifier;
        }
    
        public String getName() {
            return name;
        }

        public boolean equals(Object obj) {
            //Compare equality of objects based on objects themselves:
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            //Compare equality of objects based on identifiers:
            Item other = (Item) obj;
            if (identifier == null) {
                if (other.identifier != null)
                    return false;
            } else if (!identifier.equals(other.identifier)) {
                return false;
            }
            return true;
        }
    }
}