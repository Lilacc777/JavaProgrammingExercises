//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part4;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Items {
    public static void main(String args[]){
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            items.add(new Item(name));
        }
        for(Item item: items){
            System.out.println(item.toString());
        }
        scanner.close();
    }
    
static class Item {
    private String name;
    private LocalDateTime createdAt;

    public Item(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        return this.name + " (created at: " + formatter.format(this.createdAt) + ")";
    }
}
}