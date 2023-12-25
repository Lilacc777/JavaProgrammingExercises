package Part4;

import java.util.Scanner;
import java.util.ArrayList;

public class Books {
    public static void main(String args[]){
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Title: ");
            String title = scanner.nextLine();
            
            if(title.equals("")){
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();

        for(Book Book: books){
            if(input.equals("everything")){
                System.out.println(Book.toString());
            } else if (input.equals("name")){
                System.out.println(Book.getTitle());
            }
        }
        scanner.close();
    }

static class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String title, int numOfPages, int publicationYear) {
        this.title = title;
        this.pages = numOfPages;
        this.year = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getNumOfPages() {
        return this.pages;
    }

    public int getPublicationYear() {
        return this.year;
    }

    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
}
