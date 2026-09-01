package Tutorial_5;
import java.util.Scanner;
abstract class Product {
    int productId;
    String name;
    double price;
    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    abstract double calculateDiscount();
    void display() {
        double discount = calculateDiscount();
        double finalPrice = price - discount;
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs." + price);
        System.out.println("Discount: Rs." + discount);
        System.out.println("Final Price: Rs." + finalPrice);
        System.out.println();
    }
}
class Electronics extends Product {
    Electronics(int id, String name, double price) {
        super(id, name, price);
    }
    @Override
    double calculateDiscount() {
        return price * 0.10;
    }
}
class Clothing extends Product {
    Clothing(int id, String name, double price) {
        super(id, name, price);
    }
    @Override
    double calculateDiscount() {
        return price * 0.20;
    }
}
class Books extends Product {
    Books(int id, String name, double price) {
        super(id, name, price);
    }
    @Override
    double calculateDiscount() {
        return price * 0.05;
    }
}

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[3];

        System.out.println("Enter Electronics Details:");
        System.out.print("ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name1 = sc.nextLine();

        System.out.print("Price: ");
        double price1 = sc.nextDouble();

        products[0] = new Electronics(id1, name1, price1);

        System.out.println("\nEnter Clothing Details:");
        System.out.print("ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name2 = sc.nextLine();

        System.out.print("Price: ");
        double price2 = sc.nextDouble();

        products[1] = new Clothing(id2, name2, price2);

        System.out.println("\nEnter Book Details:");
        System.out.print("ID: ");
        int id3 = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name3 = sc.nextLine();

        System.out.print("Price: ");
        double price3 = sc.nextDouble();

        products[2] = new Books(id3, name3, price3);

        System.out.println("\n----- PRODUCT DETAILS -----");

        for (int i = 0; i < 3; i++) {
            products[i].display();
        }

        sc.close();
    }
}
