//Note: I accessed the original template code from a helpful Github repository regarding the mooc.fi course.
package Part5;

import java.util.Scanner;
import java.util.ArrayList;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book newBook = new Book(name, publicationYear);
            if (!books.contains(newBook)) {
                books.add(newBook);
            } else {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            }

        }

        System.out.println("Thank you! Books added: " + books.size());
        scanner.close();
    }

    static class Book {

        private String name;
        private int publicationYear;
    
        public Book(String name, int publicationYear) {
            this.name = name;
            this.publicationYear = publicationYear;
        }
    
        public String getName() {
            return name;
        }
    
        public int getPublicationYear() {
            return publicationYear;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Book other = (Book) obj;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            if (publicationYear != other.publicationYear)
                return false;
            return true;
        }
    
    }
}