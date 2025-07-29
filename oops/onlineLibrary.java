//will conyinue after file handling
package OOPS;
import java.util.Scanner;

class Library{
    String books[];
    Library() {
        books = new String[0];
    }
    public void addBook(String book) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the book to add: ");
        int noOfBooks= sc.nextInt();
        noOfBooks = books.length + noOfBooks;

        
    }

}
public class onlineLibrary {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        Scanner sc = new Scanner(System.in);

        System.out.println("----Welcome to the Online Library!---");

    }
}
