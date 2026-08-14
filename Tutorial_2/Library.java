package Tutorial_2;
import java.util.Scanner;
public class Library {
    String title;
    String author;
    float price;
    void display(){
        System.out.println(" ===Details of the Book===");
        System.out.println("Name of the book: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("Price of the book: " + price);
    }
}
class LibraryDemo{
    public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Title: ");
        String title = sc.nextLine();
        
        System.out.println("Enter name of the Book's author: ");
        String author = sc.nextLine();

        System.out.println("Enter price of the book: ");
        float price = sc.nextFloat();
        Library L1 = new Library();
        L1.title = title;
        L1.author = author;
        L1.price = price;
        L1.display();
        sc.close();
    }
}
