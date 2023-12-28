//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part6;

import java.util.HashMap;
import java.util.Scanner;

public class SimpleDictionary {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI textUI = new TextUI(scanner, dictionary);
        textUI.start();
        System.out.println(dictionary.translate("pike")); // prints the string "hauki"
    }

    static class TextUI {
        private Scanner scanner;
        private SimpleDictionary dictionary;

        public TextUI(Scanner scanner, SimpleDictionary dictionary){
            this.scanner = scanner;
            this.dictionary = dictionary;
        }

        public void start(){
            while(true){
                System.out.print("Command: ");
                String command = scanner.nextLine();
                if(command.equals("end")){
                    break;
                } else if(command.equals("add")){
                    add();
                } else if (command.equals("search")){
                    search();
                } else {
                    System.out.println("Unknown command");
                    continue;
                }
            }
            System.out.println("Bye bye!");
        }

        public void add(){
            System.out.print("Word: ");
            String word = scanner.nextLine();
            System.out.print("Translation: ");
            String translation = scanner.nextLine();
            this.dictionary.add(word, translation);
        }

        public void search(){
            System.out.print("To be translated: ");
            String toTranslate = scanner.nextLine();
            if(this.dictionary.translate(toTranslate) == null){
                System.out.println("Word " + toTranslate + " was not found");
            } else {
                System.out.println("Translation: " + this.dictionary.translate(toTranslate));
            }
        }
    }

    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
}