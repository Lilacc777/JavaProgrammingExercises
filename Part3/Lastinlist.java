package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class Lastinlist {
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
        System.out.println(names.get(names.size()-1));
    }
}