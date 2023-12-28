package Part6;

import java.util.ArrayList;

public class Stack {
    public static void main(String args[]){
        //Tests:
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);
    }
    
    private ArrayList<String> strings;

    public Stack(){
        this.strings = new ArrayList<>();
    }

    public boolean isEmpty(){
        if(strings.isEmpty()){
            return true;
        }
        return false;
    }

    public void add(String value){
        this.strings.add(value);
    }

    public ArrayList<String> values(){
        return this.strings;
    }

    public String take(){
        String take = this.strings.get(this.strings.size() - 1);
        this.strings.remove(take);
        return take;
    }
}