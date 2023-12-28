package Part6;

import java.util.ArrayList;

public class SantasWorkshop {
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }

    static class Package {
        private ArrayList<Gift> gifts;

        public Package(){
            this.gifts = new ArrayList<>();
        }

        public void addGift(Gift gift){
            this.gifts.add(gift);
        }

        public int totalWeight(){
            int totalWeight = 0;
            for(Gift gift: gifts){
                totalWeight += gift.getWeight();
            }
            return totalWeight;
        }
    }

    static class Gift {
        private String name;
        private int weight;

        public Gift(String name, int weight){
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