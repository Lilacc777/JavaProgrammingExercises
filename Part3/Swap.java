package Part3;

import java.util.Scanner;

public class Swap {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int[] indices = new int[5];
        indices[0] = 1;
        indices[1] = 3;
        indices[2] = 5;
        indices[3] = 7;
        indices[4] = 9;

        for(int i = 0; i < 5; i++){
            System.out.println(indices[i]);
        }
        
        System.out.println("");
        System.out.println("Give two indices to swap:");
        int index1 = Integer.valueOf(scanner.nextLine());
        int index2 = Integer.valueOf(scanner.nextLine());
        
        int helper = indices[index1];
        indices[index1] = indices[index2];
        indices[index2] = helper;
        
        System.out.println("");
        for(int i = 0; i < 5; i++){
            System.out.println(indices[i]);
        }
        scanner.close();
    }
}