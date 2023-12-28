//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part6;

import java.util.ArrayList;

public class PrintingaCollection {

static class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override

    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        if (this.elements.size() == 1) {
            return "The collection " + this.name + " has 1 element:\n" + this.elements.get(0);
        }

        String printOutput = "";
        for (String elemnt : elements) {
            printOutput += "\n" + elemnt;
        }
        return "The collection " + this.name + " has " + this.elements.size() + " elements:" + printOutput;
    }
}
}