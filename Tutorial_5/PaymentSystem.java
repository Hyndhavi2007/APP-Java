package Tutorial_5;
import java.util.Scanner;
interface Payment {
    void makePayment(double amount);
}
class UPI implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made using UPI.");
    }
}
class CreditCard implements Payment {

    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made using Credit Card.");
    }
}
class NetBanking implements Payment {

    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made using Net Banking.");
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Net Banking");

        System.out.print("Select Payment Method: ");
        int choice = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        Payment payment;

        switch (choice) {
            case 1:
                payment = new UPI();
                break;

            case 2:
                payment = new CreditCard();
                break;

            case 3:
                payment = new NetBanking();
                break;

            default:
                System.out.println("Invalid choice.");
                sc.close();
                return;
        }

        payment.makePayment(amount);

        sc.close();
    }
}
