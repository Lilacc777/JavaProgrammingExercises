package Part4;

public class Agent {
    public static void main(String args[]){
        Agent bond = new Agent("James", "Bond");
        bond.toString(); // prints nothing
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);
    }
    
    private String firstName;
    private String lastName;

    public Agent(String initialFirstName, String initialLastName){
        this.firstName = initialFirstName;
        this.lastName = initialLastName;
    }

    public String toString(){
        return "My name is " + this.firstName + ", " + this.firstName + " " + this.lastName;
    }
}