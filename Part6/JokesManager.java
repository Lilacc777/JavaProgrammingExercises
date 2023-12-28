package Part6;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class JokesManager {
    public static void main(String args[]){
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);
        
        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();
    }

    static class UserInterface {
        private JokeManager manager;
        private Scanner scan;
    
        public UserInterface(JokeManager manager, Scanner scan) {
            this.manager = manager;
            this.scan = scan;
        }
    
        public void start() {
            while (true) {
                System.out.println("Commands:");
                System.out.println("1 - add a joke");
                System.out.println("2 - draw a joke");
                System.out.println("3 - list jokes");
                System.out.println("X - stop");
                String input = this.scan.nextLine();
    
                if (input.equals("X")) {
                    break;
                }
    
                processInput(input);
            }
        }
    
        private void processInput(String input) {
            if (input.equals("1")) {
                addJoke();
            } else if (input.equals("2")) {
                drawJoke();
            } else if (input.equals("3")) {
                listJokes();
            }
        }
    
        private void addJoke() {
            System.out.println("Write the joke to be added:");
            String joke = this.scan.nextLine();
            this.manager.addJoke(joke);
        }
    
        private void drawJoke() {
            System.out.println("Drawing jokes:");
            System.out.println(this.manager.drawJoke());
        }
    
        private void listJokes() {
            System.out.println("Printing the jokes.");
            this.manager.printJokes();
        }
    
    }

    static class JokeManager {
        private ArrayList<String> jokes;

        public JokeManager() {
            this.jokes = new ArrayList<>();
        }
    
        public void addJoke(String joke) {
            this.jokes.add(joke);
        }
    
        public String drawJoke() {
            if (this.jokes.isEmpty()) {
                return "Jokes are in short supply.";
            }
    
            Random draw = new Random();
            int index = draw.nextInt(this.jokes.size());
            return this.jokes.get(index);
    
        }
    
        public void printJokes() {
            for (String joke : this.jokes) {
                System.out.println(joke);
            }
        }
    }
}