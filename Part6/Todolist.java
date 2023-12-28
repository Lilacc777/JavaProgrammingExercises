package Part6;

import java.util.ArrayList;
import java.util.Scanner;

public class Todolist {
    public static void main(String args[]){
        Todolist list = new Todolist();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(scanner, list);
        ui.start();
        list.print();
    }
    static class UserInterface {
        private Scanner scanner;
        private Todolist list;

        public UserInterface(Scanner scanner, Todolist list){
            this.scanner = scanner;
            this.list = list;
        }

        public void start(){
            while(true){
                System.out.print("Command: ");
                String command = scanner.nextLine();
                if(command.equals("stop")){
                    break;
                } else if(command.equals("add")){

                }
            }
        }

        public void add(){
            System.out.print("To add: ");
            this.list.add(scanner.nextLine());
        }

        public void list(){
            System.out.println(this.list);
        }

        public void remove(){
            System.out.print("Which one is removed? ");
            this.list.remove(Integer.valueOf(scanner.nextLine()));
        }
    }

    private ArrayList<String> toDoList;

    public Todolist(){
        this.toDoList = new ArrayList<>();
    }

    public void add(String task){
        this.toDoList.add(task);
    }

    public void print(){
        for (int i = 0; i < this.toDoList.size(); i++) {
            System.out.println(i + 1 + ": " + this.toDoList.get(i));
        }
    }

    public void remove(int number){
        int index = number - 1;
        if (index < 0 || index >= this.toDoList.size()) {
            return;
        }
        this.toDoList.remove(index);
    }
}