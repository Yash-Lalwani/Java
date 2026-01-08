package book;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        List<String> titles = new ArrayList<>();
        List<String> authors = new ArrayList<>();
        List<Boolean> isAvailable = new ArrayList<>();
        List<List<String>> methodCalls = new ArrayList<>();
            
        // Create book object using parameterised Constructor to initialize the attributes
        Book book = new Book(titles, authors, isAvailable);
            
        //Iterate over the methodCalls
        for (List<String> methodCall : methodCalls) {
            String operation = methodCall.get(0);
            String bookName = methodCall.get(1);
                
            if (operation.equals("1")) {
                
                //If the opertion is of type 1 then calling method borrowBook
                    book.borrowBook(bookName);
            } 
            else if (operation.equals("2")) {
                
                //If the opertion is of type 1 then calling method returnBook
                book.returnBook(bookName);
            } 
            else if (operation.equals("3")) {
                
                //If the opertion is of type 1 then calling method getAvailability
                book.getAvailability(bookName);
            }
        }

        System.out.print("Enter number of books: ");
        sc.nextInt();
        sc.close();
    }
}