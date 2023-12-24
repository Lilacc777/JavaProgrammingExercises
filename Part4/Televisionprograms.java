//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part4;

import java.util.Scanner;
import java.util.ArrayList;

public class Televisionprograms {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        while(true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());

        for(TelevisionProgram Program: programs){
            if(Program.getDuration() <= maxDuration){
                System.out.println(Program.toString());
            }
        }
    }

static class TelevisionProgram{
    private String name;
    private int duration;

    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public boolean isAwesome() {
        return this.name.contains("MasterChef");
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }
}
}
