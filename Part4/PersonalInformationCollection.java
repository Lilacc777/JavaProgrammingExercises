//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part4;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String args[]){
        ArrayList<PersonalInformation> information = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            
            if(firstName.equals("")){
                break;
            }
            
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Identification number: ");
            String number = scanner.nextLine();
            
            information.add(new PersonalInformation(firstName, lastName, number));
        }
        for(PersonalInformation info: information){
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

    }

static class PersonalInformation {
    private String firstName;
    private String lastName;
    private String identificationNumber;

    public PersonalInformation(String firstName, String lastName, String identificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    @Override
    public String toString() {
        return this.lastName + ", " + this.firstName + " (" + this.identificationNumber + ")";
    }
}
}