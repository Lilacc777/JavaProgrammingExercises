package Part3;

import java.util.ArrayList;

public class IndexOutOfBoundsException {
   public static void main(String args[]){
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println(integers.get(1) + integers.get(2));
   }
}