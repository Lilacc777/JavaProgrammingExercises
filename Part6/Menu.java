//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part6;

import java.util.ArrayList;

public class Menu {
    public static void main(String args[]){
        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli Coconut Chicken");
        menu.addMeal("Chilli Coconut Chicken");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();
        menu.clearMenu();

        System.out.println();
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();
    }

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal){
        if(!meals.contains(meal)){
            meals.add(meal);
        }
    }

    public void printMeals(){
        for(String meal: meals){
            System.out.println(meal);
        }
    }

    public void clearMenu(){
        meals.clear();
    }
}