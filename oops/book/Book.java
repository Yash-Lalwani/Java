package book;

import java.util.List;
class Book {
    public List<String> title;
    public List<String> author;
    private List<Boolean> isAvailable;

    public Book(List<String> title, List<String> author, List<Boolean> isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public void borrowBook(String bookName) {
        int idx = -1;
        // to check if the bookName even exist in the book title list and get it's index
        for (int i = 0; i < title.size(); i++) {
            if (title.get(i).equals(bookName)) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("Book is not available.");
        }
        else if (isAvailable.get(idx) == true) {
            isAvailable.set(idx, false);
        }
        else {
            System.out.println("Book is not available.");
        }
    }

    // The book with bookName is returned and should be marked as available by setting its available flag to true.
    public void returnBook(String bookName) {
        for (int i = 0; i < title.size(); i++) {
            if (title.get(i).equals(bookName)) {
                isAvailable.set(i, true);
            }
        }
    }

    // Prints the availability status of the book with name 'bookName' (true for available , false for unavailable).
    public void getAvailability(String bookName) {
        boolean status = false;
        boolean found = false;
        for (int i = 0; i < title.size(); i++) {
            if (title.get(i).equals(bookName)) {
                status = isAvailable.get(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("book not found in database");
            return;
        }

        if (status == true) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}