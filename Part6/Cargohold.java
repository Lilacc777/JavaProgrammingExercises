package Part6;

import java.util.ArrayList;

public class Cargohold {
    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);
    }

    static class Hold {
        private int maxWeight;
        private ArrayList<Suitcase> suitcases;
    
        public Hold(int maxWeight) {
            this.maxWeight = maxWeight;
            this.suitcases = new ArrayList<>();
        }
    
        public int getSuitcasesTotalWeight() {
            int suitcasesTotalWeight = 0;
            for (Suitcase suitcase : this.suitcases) {
                suitcasesTotalWeight += suitcase.totalWeight();
            }
            return suitcasesTotalWeight;
        }
    
        public void addSuitcase(Suitcase suitcase) {
            if (getSuitcasesTotalWeight() + suitcase.totalWeight() > maxWeight) {
                return;
            }
            this.suitcases.add(suitcase);
        }
    
        public void printItems() {
            for (Suitcase suitcase : this.suitcases) {
                suitcase.printItems();
            }
        }
    
        @Override
        public String toString() {
            if (this.suitcases.isEmpty()) {
                return "no suitcases (0 kg)";
            }
    
            if (this.suitcases.size() == 1) {
                return "1 suitcase (" + this.getSuitcasesTotalWeight() + " kg)";
            }
    
            return this.suitcases.size() + " suitcases (" + this.getSuitcasesTotalWeight() + " kg)";
        }
    
    }
    
    static class Suitcase {
        private ArrayList<Item> items;
        private int maxWeight;

        public Suitcase(int maxWeight){
            this.items = new ArrayList<>();
            this.maxWeight = maxWeight;
        }

        public void addItem(Item item){
            if(totalWeight() + item.getWeight() <= this.maxWeight){
                this.items.add(item);
            }
        }

        public void printItems(){
            for(Item Item : this.items){
                System.out.println(Item);
            }
        }

        public int totalWeight(){
            int totalWeight = 0;
            for (Item Item : this.items) {
                totalWeight += Item.getWeight();
            }
            return totalWeight;
        }

        public Item heaviestItem(){
            int heaviest = 0;
            Item Heaviest = this.items.get(0);
            for(Item Item : items){
                if(Item.getWeight() > heaviest){
                    Heaviest = Item;
                } else if(this.items.isEmpty()){
                    return null;
                }
            }
            return Heaviest;
        }

        public String toString(){
            if(this.items.size() == 1){
                return "1 item (" + this.maxWeight + " kg)";
            } else if(this.items.size() == 0) {
                return "no items (" + this.maxWeight + " kg)";
            } else {
                return this.items.size() + " items (" + this.maxWeight + " kg)";
            }
        }
    }

    static class Item {
        private String name;
        private int weight;

        public Item(String name, int weight){
            this.name = name;
            this.weight = weight;
        }

        public String getName(){
            return this.name;
        }

        public int getWeight(){
            return this.weight;
        }

        public String toString(){
            return this.name + " (" + this.weight + " kg)";
        }
    }
}