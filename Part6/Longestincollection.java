//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part6;

import java.util.ArrayList;

public class Longestincollection {

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

    public String longest(){
        if(this.elements.isEmpty()){
            return null;
        }

        String longest = this.elements.get(0);
        for(String element : this.elements){
            if(longest.length() < element.length()){
                longest = element;
            }
        }
        return longest;
    }

}
}